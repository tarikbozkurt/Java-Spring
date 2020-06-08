package com.SpringStarted.api;


import com.SpringStarted.entity.Kullanici;
import com.SpringStarted.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/kullanici")
public class KullaniciApi {

    @Autowired
    private KullaniciRepository kullaniciRepository;

    @PostConstruct
    public void init(){
        Kullanici kullanici = new Kullanici();
        kullanici.setAdi("tarik");
        kullanici.setSoyadi("bozkurt");
        kullaniciRepository.save(kullanici);
    }

    @PostMapping
    // ekle fonksiyonu kaydettikten sonra nesnenin kendisini kendisi döner, kaydeceği nesneyi parametre ister" Kullanıcı "
    public ResponseEntity<Kullanici> ekle(@RequestBody Kullanici kullanici) {
        return ResponseEntity.ok(kullaniciRepository.save(kullanici)); //repository in save methodune parametre gelen kullanıcıyı gönder. Tüm mesajlar düzende olması adına RESPONSEeNTİTY

    }

    @GetMapping
    public ResponseEntity<List<Kullanici>> tumunuListele() {
        return ResponseEntity.ok(kullaniciRepository.findAll());

    }

}
