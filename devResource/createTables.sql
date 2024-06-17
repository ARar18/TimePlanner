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