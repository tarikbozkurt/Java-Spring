package com.SpringStarted.repository;

import com.SpringStarted.entity.Kullanici;
import org.springframework.data.mongodb.repository.MongoRepository;

/* repository entity aracılığı ile veri tabanına bağlanacak,veri tabanından getir, kaydet vb işlemleri yapcak katmanın

tamamı burada olacak

*/
// interface olmalı , Kullanıcı nesnesinde String tipinde çalışcak... "Kullanici nesnesi - Entity de n geliyor"


public interface KullaniciRepository extends MongoRepository<Kullanici, String> {


    //tekrar tekrar yazılmayı engellemek için interface class yazıp bunların tanımına erişim sağlayacağız..



}
