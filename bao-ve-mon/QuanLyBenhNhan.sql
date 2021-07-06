CREATE DATABASE QuanLyBenhNhan
GO 

USE QuanLyBenhNhan
GO

CREATE TABLE NguoiDung(
	MaND VARCHAR(25) NOT NULL,
	TenND NVARCHAR(50) NOT NULL,
	MatKhau VARCHAR(25) NOT NULL,
	VaiTro BIT NOT NULL DEFAULT 0,
	PRIMARY KEY (MaND)
)
GO

CREATE TABLE BenhNhan(
	MaBN VARCHAR(25) NOT NULL,
	TenBN NVARCHAR(50) NOT NULL,
	DiaChi NVARCHAR (100) NOT NULL,
	GioiTinh BIT NOT NULL DEFAULT 0,
	NgaySinh DATE NOT NULL ,
	PRIMARY KEY (MaBN)
)
GO

CREATE TABLE BacSi(
	MaBS VARCHAR(25) NOT NULL,
	TenBS NVARCHAR(100) NOT NULL,
	PRIMARY KEY (MaBS)
)
GO

CREATE TABLE PhieuKham(
	MaPhieu INT IDENTITY(1,1) NOT NULL,
	MaBS VARCHAR(25) NOT NULL,
	MaBN VARCHAR(25) NOT NULL,
	ChuanDoan  NVARCHAR(50) NOT NULL,
	ChiPhi FLOAT NOT NULL,
	PRIMARY KEY (MaPhieu),
	FOREIGN KEY (MaBS) REFERENCES BacSi(MaBS) ON UPDATE CASCADE,
	FOREIGN KEY (MaBN) REFERENCES BenhNhan(MaBN) ON DELETE CASCADE,
)
GO

INSERT INTO NguoiDung VALUES
('admin', N'admin', 'admin', 1),
('user', N'user', 'user', 0),
('TeoNV', N'Nguyễn Văn Tèo', '123', 0),
('MaiNT', N'Nguyễn Thị Mai', '321', 1)
GO

insert into BenhNhan values
('BN001', N'Nguyễn Thị Hồng Hạnh', N'Quận 4, TP.HCM', 0, '1998-06-25'),
('BN002', N'Trần Huy Nam', N'Quận 12, TP.HCM', 1, '1995-03-12'),
('BN003', N'Vũ Ngọc Bảo Trâm', N'Quận 3, TP.HCM', 0, '1999-01-21'),
('BN004', N'Nguyễn Thị Sơn Trà', N'Quận 7, TP.HCM', 0, '1995-06-12'),
('BN005', N'Hồ Quang Tèo', N'Quận 12, TP.HCM', 0, '2001-03-29'),
('BN006', N'Đặng Thái Sĩ Khoa', N'Quận 3, TP.HCM', 0, '1992-06-15'),
('BN007', N'Lê Bảo Sơn', N'Quận 1, TP.HCM', 0, '1999-06-24')
GO

INSERT INTO BacSi VALUES
('BaoNTT', N'Nguyễn Trầm Thiên Bảo'),
('HanhNTH', N'Nguyễn Thị Hồng Hạnh'),
('QuangND', N'Nguyễn Duy Quang')
GO

INSERT INTO PhieuKham (MaBS, MaBN, ChuanDoan, ChiPhi) VALUES
('HanhNTH', 'BN001',  N'Vảy nến', 600000),
('QuangND', 'BN002', N'Viêm loét đại tràng', 1100000),
( 'BaoNTT', 'BN003',N'Đục thuỷ tinh thể', 1500000),
( 'BaoNTT', 'BN004',N'Viêm màng bồ đào', 250000),
( 'QuangND', 'BN005',N'Xuất huyết dạ dày', 900000),
( 'HanhNTH', 'BN006',N'Viêm bì cơ', 700000),
( 'HanhNTH', 'BN007',N'Zona thần kinh', 500000)
GO

-----------------------------------------------------------------

CREATE PROCEDURE sp_BenhNhanChiTiet(@MaBS VARCHAR(25))
AS
	BEGIN
		SELECT PK.MaBN, TenBN, ChuanDoan, ChiPhi FROM PhieuKham PK
			INNER JOIN BenhNhan BN ON PK.MaBN = BN.MaBN
		WHERE MaBS = @MaBS
	END
GO

--CREATE PROCEDURE sp_tongChiPhi
-- @MaBS VARCHAR(25), @TongChiPhi FLOAT OUTPUT
--AS
--	BEGIN
--		SELECT @TongChiPhi = SUM(ChiPhi)  FROM PhieuKham PK
--		WHERE PK.MaBS = @MaBS
--	END