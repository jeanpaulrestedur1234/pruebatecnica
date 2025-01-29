-- Tabla para las Empresas
CREATE TABLE Empresa (
    NIT VARCHAR(20) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(200),
    telefono VARCHAR(15)
);

-- Tabla para los Usuarios
CREATE TABLE Usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    correo VARCHAR(100) UNIQUE NOT NULL,
    contrasena VARCHAR(255) NOT NULL, -- La contraseña será encriptada
    tipo ENUM('Administrador', 'Externo') NOT NULL
);

-- Tabla para las Categorías
CREATE TABLE Categoria (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) UNIQUE NOT NULL
);

-- Tabla para los Productos
CREATE TABLE Producto (
    codigo VARCHAR(50) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    caracteristicas TEXT,
    precio DECIMAL(10, 2) NOT NULL,
    moneda ENUM('USD', 'EUR', 'COP') NOT NULL,
    empresa_NIT VARCHAR(20),
    FOREIGN KEY (empresa_NIT) REFERENCES Empresa(NIT) ON DELETE CASCADE
);

-- Relación muchos a muchos entre Productos y Categorías
CREATE TABLE Producto_Categoria (
    producto_codigo VARCHAR(50),
    categoria_id INT,
    PRIMARY KEY (producto_codigo, categoria_id),
    FOREIGN KEY (producto_codigo) REFERENCES Producto(codigo) ON DELETE CASCADE,
    FOREIGN KEY (categoria_id) REFERENCES Categoria(id) ON DELETE CASCADE
);

-- Tabla para los Clientes
CREATE TABLE Cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(100) UNIQUE NOT NULL,
    telefono VARCHAR(15)
);

-- Tabla para las Órdenes
CREATE TABLE Orden (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cliente_id INT,
    fecha DATE NOT NULL,
    total DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (cliente_id) REFERENCES Cliente(id) ON DELETE CASCADE
);

-- Relación muchos a muchos entre Órdenes y Productos
CREATE TABLE Orden_Producto (
    orden_id INT,
    producto_codigo VARCHAR(50),
    cantidad INT NOT NULL,
    PRIMARY KEY (orden_id, producto_codigo),
    FOREIGN KEY (orden_id) REFERENCES Orden(id) ON DELETE CASCADE,
    FOREIGN KEY (producto_codigo) REFERENCES Producto(codigo) ON DELETE CASCADE
);

-- Tabla para el Inventario
CREATE TABLE Inventario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    producto_codigo VARCHAR(50),
    empresa_NIT VARCHAR(20),
    cantidad INT NOT NULL,
    FOREIGN KEY (producto_codigo) REFERENCES Producto(codigo) ON DELETE CASCADE,
    FOREIGN KEY (empresa_NIT) REFERENCES Empresa(NIT) ON DELETE CASCADE
);
