CREATE TABLE IF NOT EXISTS devices ( deviceid serial PRIMARY KEY,
    name VARCHAR(200),
    model VARCHAR(200),
    description VARCHAR(200),
    device_type VARCHAR(200),
    manufacturer VARCHAR(200),
    device_mgr_id INTEGER,
    location_id INTEGER,
    active BOOLEAN,
    last_updated_time DATE NOT NULL DEFAULT CURRENT_DATE
);