CREATE TABLE regions (
                         id SERIAL PRIMARY KEY,
                         name CHARACTER VARYING (25)
);

CREATE TABLE countries (
                           id VARCHAR(2) PRIMARY KEY CHECK (length(id) = 2),
                           name CHARACTER VARYING (40),
                           region_id INTEGER NOT NULL,
                           FOREIGN KEY (region_id) REFERENCES regions (id) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE locations (
                           id SERIAL PRIMARY KEY,
                           street_address CHARACTER VARYING (40),
                           postal_code CHARACTER VARYING (12),
                           city CHARACTER VARYING (30) NOT NULL,
                           state_province CHARACTER VARYING (25),
                           country_id VARCHAR(2) NOT NULL CHECK (length(country_id) = 2),
                           FOREIGN KEY (country_id) REFERENCES countries (id) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE departments (
                             id SERIAL PRIMARY KEY,
                             name CHARACTER VARYING (30) NOT NULL,
                             location_id INTEGER,
                             FOREIGN KEY (location_id) REFERENCES locations (id) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE jobs (
                      id SERIAL PRIMARY KEY,
                      job_title CHARACTER VARYING (35) NOT NULL,
                      min_salary NUMERIC (8, 2),
                      max_salary NUMERIC (8, 2)
);

CREATE TABLE employees (
                           id SERIAL PRIMARY KEY,
                           first_name CHARACTER VARYING (20),
                           last_name CHARACTER VARYING (25) NOT NULL,
                           email CHARACTER VARYING (100) NOT NULL,
                           phone_number CHARACTER VARYING (20),
                           hire_date DATE NOT NULL,
                           job_id INTEGER NOT NULL,
                           salary NUMERIC (8, 2) NOT NULL,
                           manager_id INTEGER,
                           department_id INTEGER,
                           FOREIGN KEY (job_id) REFERENCES jobs (id) ON UPDATE CASCADE ON DELETE CASCADE,
                           FOREIGN KEY (department_id) REFERENCES departments (id) ON UPDATE CASCADE ON DELETE CASCADE,
                           FOREIGN KEY (manager_id) REFERENCES employees (id) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE dependents (
                            id SERIAL PRIMARY KEY,
                            first_name CHARACTER VARYING (50) NOT NULL,
                            last_name CHARACTER VARYING (50) NOT NULL,
                            relationship CHARACTER VARYING (25) NOT NULL,
                            employee_id INTEGER NOT NULL,
                            FOREIGN KEY (employee_id) REFERENCES employees (id) ON DELETE CASCADE ON UPDATE CASCADE
);