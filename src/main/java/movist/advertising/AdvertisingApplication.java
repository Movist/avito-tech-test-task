package movist.advertising;

import movist.advertising.domain.Advert;
import movist.advertising.domain.AdvertRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Column;

@SpringBootApplication
public class AdvertisingApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AdvertisingApplication.class);

    @Autowired
    private AdvertRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(AdvertisingApplication.class, args);
        logger.info("app started");
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Advert(
                "Ноутбук MSI 17.3",
                "Продам игровой ноутбук. Хороший, мощный, i5, 16 gb оперативной памяти, NVIDIA GeForce RTX 3050 видеокарта",
                "https://59.img.avito.st/image/1/1.ZnANmba6ypk7MAicTaBcfcA6zJ25usJbvDrOkbEyyA.kmhZ0x-2QQ-gs_NzcoggE1t3A3-kHuo5PMDBYET4zbY",
                65000,
                "28.01.2023"
        ));
        repository.save(new Advert(
                "Ноутбук Lenovo 15.6",
                "Состояние отличное, есть коробка, оригинальная зарядка и документы. Работает быстро. Поддерживает Wi-Аi 5GHz Аккумулятор до 4 часов.",
                "https://59.img.avito.st/image/1/1.ZnANmba6ypk7MAicTaBcfcA6zJ25usJbvDrOkbEyyA.kmhZ0x-2QQ-gs_NzcoggE1t3A3-kHuo5PMDBYET4zbY",
                22500,
                "30.01.2023"
        ));
        repository.save(new Advert(
                "Ноутбук asus rog strix g17",
                "Хороший игровой ноутбук. Полноценная видиокарта rtx 3070. Игры все на максималках тянет. Чистота экрана 300герц. Очень хорошее охлаждение. Работает отлично, никаких проблем нет. Брал для проектора но по факту уже почти два года стоял без дела. Гарантии уже нет.",
                "https://59.img.avito.st/image/1/1.ZnANmba6ypk7MAicTaBcfcA6zJ25usJbvDrOkbEyyA.kmhZ0x-2QQ-gs_NzcoggE1t3A3-kHuo5PMDBYET4zbY",
                11000,
                "30.01.2023"
        ));
        repository.save(new Advert(
                "Новый ноутбук Honor 15,6 Ryzen5/8/512гб",
                "Абсолютно новый Ноутбук Honor MagicBook Gray (BMH-WDQ9HN). Не вскрывался, все заводские пломбы на месте.",
                "https://59.img.avito.st/image/1/1.ZnANmba6ypk7MAicTaBcfcA6zJ25usJbvDrOkbEyyA.kmhZ0x-2QQ-gs_NzcoggE1t3A3-kHuo5PMDBYET4zbY",
                39999,
                "02.02.2023"
        ));
        repository.save(new Advert(
                "Lenovo Legion 5 rtx 3060",
                "Игровой Ноутбук Lenovo Legion 5 15ACH6H Идеальнейшее состояние (как Новый)- Без следов эксплуатации (прям вообще)- Можно на подарок.- Без каких либо дефектов, даже мелких.- Полный комплект. Чек . РСТ из ДHC Гарантия до 15.08.2023(Рабочая гарантия в отличии от парал. Импорта)Лучший ноутбук за свою цену , в интернете полно обзоров на него.",
                "https://59.img.avito.st/image/1/1.ZnANmba6ypk7MAicTaBcfcA6zJ25usJbvDrOkbEyyA.kmhZ0x-2QQ-gs_NzcoggE1t3A3-kHuo5PMDBYET4zbY",
                88000,
                "03.01.2023"
        ));
        repository.save(new Advert(
                "Ноутбук Lenovo i7 + 512gb SSD",
                "Lenovo ThinkPad 14 С покупки ноутбука прошло два года Всё работает Пользовался в пределах квартиры, из дома не выносил",
                "https://59.img.avito.st/image/1/1.ZnANmba6ypk7MAicTaBcfcA6zJ25usJbvDrOkbEyyA.kmhZ0x-2QQ-gs_NzcoggE1t3A3-kHuo5PMDBYET4zbY",
                35000,
                "15.01.2023"
        ));
        repository.save(new Advert(
                "Custom MacBook Pro 15 2019 i7/32Gb/512Gb/Pro 555X",
                "Гравировку с русскими буквами делают за 1000 р везде( сделаю скидочку на это)",
                "https://59.img.avito.st/image/1/1.ZnANmba6ypk7MAicTaBcfcA6zJ25usJbvDrOkbEyyA.kmhZ0x-2QQ-gs_NzcoggE1t3A3-kHuo5PMDBYET4zbY",
                85000,
                "13.01.2023"
        ));
        repository.save(new Advert(
                "Apple MacBook Pro 15 Retina 2019",
                "Все работает очень быстро, отпечаток и тачбар отлично работают Состояние отличное, вмятин нет, сколов нет, клавиатура не залипает, все в порядке",
                "https://59.img.avito.st/image/1/1.ZnANmba6ypk7MAicTaBcfcA6zJ25usJbvDrOkbEyyA.kmhZ0x-2QQ-gs_NzcoggE1t3A3-kHuo5PMDBYET4zbY",
                78000,
                "17.01.2023"
        ));
        repository.save(new Advert(
                "Ноутбук Lenovo i7 + 512gb SSD",
                "",
                "https://59.img.avito.st/image/1/1.ZnANmba6ypk7MAicTaBcfcA6zJ25usJbvDrOkbEyyA.kmhZ0x-2QQ-gs_NzcoggE1t3A3-kHuo5PMDBYET4zbY",
                11000,
                "30.01.2023"
        ));
        repository.save(new Advert(
                "Lenovo Yoga (oled) i7 + 16RAM",
                "Ноутбук Lenovo ThinkPad YOGA Состояние идеальное, пользовался мало. В основном использовал макбук",
                "https://59.img.avito.st/image/1/1.ZnANmba6ypk7MAicTaBcfcA6zJ25usJbvDrOkbEyyA.kmhZ0x-2QQ-gs_NzcoggE1t3A3-kHuo5PMDBYET4zbY",
                44000,
                "23.01.2023"
        ));
        repository.save(new Advert(
                "MSI GF75 17”144Гц GTX1650ti/i5/8GB/256SSD",
                "Игровой Ноутбук MSI GF75 9SCSR-454XRU",
                "https://59.img.avito.st/image/1/1.ZnANmba6ypk7MAicTaBcfcA6zJ25usJbvDrOkbEyyA.kmhZ0x-2QQ-gs_NzcoggE1t3A3-kHuo5PMDBYET4zbY",
                50000,
                "26.01.2023"
        ));
        repository.save(new Advert(
                "Мощный игровой Asus Core i7 16Gb, IPS, Nvidia GTX",
                "Asus X560, свежая начинка, тонкие рамки, мощный процессор и игровая видеокарта. В отличном состоянии.",
                "https://59.img.avito.st/image/1/1.ZnANmba6ypk7MAicTaBcfcA6zJ25usJbvDrOkbEyyA.kmhZ0x-2QQ-gs_NzcoggE1t3A3-kHuo5PMDBYET4zbY",
                65000,
                "01.01.2023"
        ));

    }
}
