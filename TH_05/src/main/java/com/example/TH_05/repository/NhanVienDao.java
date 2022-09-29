
package com.example.TH_05.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.TH_05.entity.NhanVien;
@Repository
public interface NhanVienDao extends CrudRepository<NhanVien, String>{
	@Query(value = "select sum(Luong) from nhanvien",nativeQuery = true)
	public int sumLuongNV();
	@Query(value = "select top 1 MaNV,MAX(Luong) from nhanvien group by MaNV",nativeQuery = true)
	public List<Object[]> listLuongMax();

	@Query(value = "select nhanvien.MaNV,Ten,Luong from nhanvien full outer join chungnhan on nhanvien.MaNV=chungnhan.MaNV\r\n"
			+ "where chungnhan.MaNV is null",nativeQuery = true)
	public List<Object[]> listNotPhiCong();
}