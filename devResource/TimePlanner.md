## TimePlanner

1. 需求分析

   - 能够创建任务

     - 任务具有完成/未完成状态
     - 任务具有未分配/已分配/进行中/过时的时间状态
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

      

   2. 模式