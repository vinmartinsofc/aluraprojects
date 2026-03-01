
ALTER TABLE medicos
ADD COLUMN ativo TINYINT(1) NOT NULL DEFAULT 1
COMMENT 'Indica se o registro está ativo (1) ou inativo (0)';

ALTER TABLE pacientes
ADD COLUMN ativo TINYINT(1) NOT NULL DEFAULT 1
COMMENT 'Indica se o registro está ativo (1) ou inativo (0)';