## TimePlanner

1. 需求分析

   - 能够创建任务

     - 任务具有完成/未完成状态
     - 任务具有未分配/已分配的分配状态
     - 任务可以和时间块一起建立
     - 任务可以按周/天循环创建（与时间块一起）
     - 任务可以具有子任务
       - 子任务具有任务的一切性质
       - 所有子任务完成时任务完成
     - 如果时间段结束后任务未完成，可以快速重建任务

   - 能够创建标签

     - 标签可以具有备注
     - 标签可以具有颜色
     - 标签不能重名

   - 每个任务可以被赋予多个标签

   - 可以创建分栏

     - 分栏中可以有多个任务
     - 分栏仅用于展示

   - 可以创建分类

     - 分类可以嵌套

   - 可以展示任务

     - 可以展示所有任务（列表视图）
       - 可以按标签展示
       - 可以排序（按时间、按字母顺序、按标签字母顺序…）
     - 可以按分栏展示（看板视图）
       - 可以排序（同上）
     - 可以按分配/未分配/已过时/进行中时间展示（时间分配视图）
     - 可以按分配的时间展示（时间规划视图）

   - 可以创建时间块

     - 时间块为一次性
     - 一个时间块仅属于一个任务

   - 可以展示统计数据

     - 展示一段时间内完成的任务量

       - 展示过时的任务量

     - 展示一段时间内完成的时间段量

     - 展示一段时间内的工作时间量

       

2. 数据库设计

   1. E-R图

      ![ER](C:\Users\86131\Desktop\笔记\image\ER-1718536533765-2.png)
   
   2. 模式设计
   
      Tasks(<u>id</u>, name, discription, is_complete)
   
      Task_relation(<u>id</u>, ancestor, descendant)
   
      Time_boxes(<u>id</u>, start_time, end_time)
   
      Time_giving(<u>id</u>, task_id, time_box_id)
   
      Columns(<u>id</u>, name, discription)
   
      Belong_to_columns(<u>id</u>, task_id, column_id)
   
      Labels(<u>id</u>, name, color, discription)
   
      Labeling(id, task_id, label_id)
   
      Catalog(id, name)
   
      Catalog_relation(<u>id</u>, ancestor, descendant)
   
      Task_path(id, task_id, catalog_id)
   
   3. sql(mysql)代码实现
   
      ``` mysql
      CREATE TABLE IF NOT EXISTS Tasks (
          id INT AUTO_INCREMENT PRIMARY KEY,
          name VARCHAR(100) NOT NULL,
          description TEXT,
          is_complete BOOLEAN
      );
      
      CREATE TABLE IF NOT EXISTS Task_relation (
          id INT AUTO_INCREMENT PRIMARY KEY,
          ancestor INT,
          descendant INT,
          CONSTRAINT fk_task_relation_ancestor FOREIGN KEY (ancestor) REFERENCES Tasks(id),
          CONSTRAINT fk_task_relation_descendant FOREIGN KEY (descendant) REFERENCES Tasks(id)
      );
      
      CREATE TABLE IF NOT EXISTS Time_boxes (
          id INT AUTO_INCREMENT PRIMARY KEY,
          start_time DATETIME,
          end_time DATETIME
      );
      
      CREATE TABLE IF NOT EXISTS Time_giving (
          id INT AUTO_INCREMENT PRIMARY KEY,
          task_id INT,
          time_box_id INT,
          CONSTRAINT fk_time_giving_task_id FOREIGN KEY (task_id) REFERENCES Tasks(id),
          CONSTRAINT fk_time_giving_time_box_id FOREIGN KEY (time_box_id) REFERENCES Time_boxes(id)
      );
      
      CREATE TABLE IF NOT EXISTS Columns (
          id INT AUTO_INCREMENT PRIMARY KEY,
          name VARCHAR(100) NOT NULL,
          description TEXT
      );
      
      CREATE TABLE IF NOT EXISTS Belong_to_columns (
          id INT AUTO_INCREMENT PRIMARY KEY,
          task_id INT,
          column_id INT,
          CONSTRAINT fk_belong_to_columns_task_id FOREIGN KEY (task_id) REFERENCES Tasks(id),
          CONSTRAINT fk_belong_to_columns_column_id FOREIGN KEY (column_id) REFERENCES Columns(id)
      );
      
      CREATE TABLE IF NOT EXISTS Labels (
          id INT AUTO_INCREMENT PRIMARY KEY,
          name VARCHAR(100) NOT NULL,
          color VARCHAR(20),
          description TEXT
      );
      
      CREATE TABLE IF NOT EXISTS Labeling (
          id INT AUTO_INCREMENT PRIMARY KEY,
          task_id INT,
          label_id INT,
          CONSTRAINT fk_labeling_task_id FOREIGN KEY (task_id) REFERENCES Tasks(id),
          CONSTRAINT fk_labeling_label_id FOREIGN KEY (label_id) REFERENCES Labels(id)
      );
      
      CREATE TABLE IF NOT EXISTS Catalog (
          id INT AUTO_INCREMENT PRIMARY KEY,
          name VARCHAR(100)
      );
      
      CREATE TABLE IF NOT EXISTS Catalog_relation (
          id INT AUTO_INCREMENT PRIMARY KEY,
          ancestor INT,
          descendant INT,
          CONSTRAINT fk_catalog_relation_ancestor FOREIGN KEY (ancestor) REFERENCES Catalog(id),
          CONSTRAINT fk_catalog_relation_descendant FOREIGN KEY (descendant) REFERENCES Catalog(id)
      );
      
      CREATE TABLE IF NOT EXISTS Task_path (
          id INT AUTO_INCREMENT PRIMARY KEY,
          task_id INT,
          catalog_id INT,
          CONSTRAINT fk_task_path_task_id FOREIGN KEY (task_id) REFERENCES Tasks(id),
          CONSTRAINT fk_task_path_catalog_id FOREIGN KEY (catalog_id) REFERENCES Catalog(id)
      );
      ```

3. 

