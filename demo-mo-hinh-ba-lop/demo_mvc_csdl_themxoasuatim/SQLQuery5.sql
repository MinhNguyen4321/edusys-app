USE [quanlybanhang02]
GO
/****** Object:  StoredProcedure [dbo].[demsosanpham]    Script Date: 04/06/2020 4:33:11 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
ALTER Proc [dbo].[demsosanpham]
@madm nchar(10),@sosanpham int output 
as
select @sosanpham=count(masp) from sanpham,danhmuc
where sanpham.madm=danhmuc.madm and sanpham.madm=@madm and sanpham.isdelete=0