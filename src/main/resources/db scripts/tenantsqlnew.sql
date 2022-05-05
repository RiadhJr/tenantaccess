/*    alter table adjustment_details 
       drop constraint FKjmc25dl1ldwc8ejipi7ydy3dk
       ;
    
    alter table adjustment_details 
       drop constraint FK44cq3qaq6w2akqveahjv1qq54
       ;
    
    alter table adjustment_details 
       drop constraint FK29474utthbh5so4bkix6d00pd
;
    
    alter table adjustments 
       drop constraint FKblce0mpmgcocmguvnva8ofo1s
;
    
    alter table adjustments 
       drop constraint FK8cmjqeon67gbb8xk8ues2v4u
;
    
    alter table expense_categories 
       drop constraint FKjbcw6agqb7ya6s33yrxfe4ymp
;
    
    alter table expenses 
       drop constraint FK62n5q2inmp5rpeugm0pny5qp1
;
    
    alter table expenses 
       drop constraint FKhpk0n2cbnfiuu5nrgl0ika3hq
;
    
    alter table expenses 
       drop constraint FKky2fd53k1f85rdtkpyyimy9li
;
    
    alter table payment_purchase_returns 
       drop constraint FKo70wjwtevap1rvsfraxhbdjnq
;
    
    alter table payment_purchase_returns 
       drop constraint FKs00nu29ftrlrj88nefke2cxn0
;
    
    alter table payment_purchases 
       drop constraint FKpbq8vv1l2uiieragfbuvigddq
;
    
    alter table payment_purchases 
       drop constraint FK98sehhe1g1i7jla6xt7dhpn34
;
    
    alter table payment_sale_returns 
       drop constraint FKqb0h1qwj9dc6ytrqq0af3ncwm
;
    
    alter table payment_sale_returns 
       drop constraint FK840y3ilxt1br9j6t7p9yeabw5
;
    
    alter table payment_sales 
       drop constraint FKfkoaea5b43flsv20nfyagv3u
;
    
    alter table payment_sales 
       drop constraint FKgolnmnuuifqd52s0h5q7tpap8
;
    
    alter table permission_role 
       drop constraint FK6mg4g9rc8u87l0yavf8kjut05
;
    
    alter table permission_role 
       drop constraint FK3vhflqw0lwbwn49xqoivrtugt
;
    
    alter table product_variants 
       drop constraint FKosqitn4s405cynmhb87lkvuau
;
    
    alter table product_warehouse 
       drop constraint FKflvceifyxftlw7a7kfxkjfw4y
;
    
    alter table product_warehouse 
       drop constraint FK8mm3bmktx4ipfnkk1r72d2qqf
;
    
    alter table product_warehouse 
       drop constraint FKb079c7n0iwp9kyhxg05ilawqa
;
    
    alter table products 
       drop constraint FKa3a4mpsfdf4d2y6r8ra3sc8mv
;
    
    alter table products 
       drop constraint FKog2rp4qthbtt2lfyhfo32lsw9
;
    
    alter table products 
       drop constraint FKeex0i50vfsa5imebrfdiyhmp9
;
    
    alter table products 
       drop constraint FKh366vywndv4pijim81ul56747
;
    
    alter table products 
       drop constraint FKr1e7sd726jtaifeam5h2i10pk
;
    
    alter table purchase_details 
       drop constraint FKdardplwswx5axlhgub8gi3dxr
;
    
    alter table purchase_details 
       drop constraint FKcxl0u6f0whli7bhn1q8ja0ba3
;
    
    alter table purchase_details 
       drop constraint FK8nalokyn4ap9ebeo5hjjximls
;
    
    alter table purchase_details 
       drop constraint FKb73jher2ahwkm3ufsfbjp8qrl
;
    
    alter table purchase_return_details 
       drop constraint FKi1m8x9qbs31gmgk48lercfh60
;
    
    alter table purchase_return_details 
       drop constraint FK7tta5uxl8ii1e0triierd1lwo
;
    
    alter table purchase_return_details 
       drop constraint FKom8y1bsv0fojd4bt5kgfhvbw8
;
    
    alter table purchase_return_details 
       drop constraint FKslcedf3s0jqjuflg9eonve6q3
;
    
    alter table purchase_returns 
       drop constraint FK23hv85p8q8v08hood6el3jffx
;
    
    alter table purchase_returns 
       drop constraint FK8yvur48mh0n46de69uaojgbyw
;
    
    alter table purchase_returns 
       drop constraint FKihwyabpeahrl2yv7ivjflrxlj
;
    
    alter table purchases 
       drop constraint FKbn2k5burari3lcgietiifq9ho
;
    
    alter table purchases 
       drop constraint FKm0ndjymn9p747pfp4515pio8i
;
    
    alter table purchases 
       drop constraint FKo5ayqstf3r4ec39aykkavuscp
;
    
    alter table quotation_details 
       drop constraint FK47semmwcknt178jtvifd67pii
;
    
    alter table quotation_details 
       drop constraint FKaqydkynkh434ifin8tw1jehq6
;
    
    alter table quotation_details 
       drop constraint FKolxi2hah5a2praypvlyrxmiov
;
    
    alter table quotation_details 
       drop constraint FKn4iu0kt443iyv8m6s04h5h0md
;
    
    alter table quotations 
       drop constraint FKn8qu972xetsfvcj0atbsbxj6t
;
    
    alter table quotations 
       drop constraint FKj3s7ongcvjncktb1xnyvrns07
;
    
    alter table quotations 
       drop constraint FKl4y8f5ujgi3fs653menqyw0j2
;
    
    alter table role_user 
       drop constraint FK7tjfd3wunlpu0di6qpu5asgen
;
    
    alter table role_user 
       drop constraint FKhvai2k29vlwpt9wod4sw4ghmn
;
    
    alter table sale_details 
       drop constraint FKmu5mqpa8wg2m2ukufbchdacdm
;
    
    alter table sale_details 
       drop constraint FKqvh82ispfukxa2yssnok0m12o
;
    
    alter table sale_details 
       drop constraint FK6nruj5m7ntwhc29etigqnlk0m
;
    
    alter table sale_details 
       drop constraint FKbsd5fduysox0fquwcasmr88og
;
    
    alter table sale_return_details 
       drop constraint FKlfanga77ry7m7rg0ae6rbs8su
;
    
    alter table sale_return_details 
       drop constraint FK6cv7g4chqvnbn0d08ken9am8u
;
    
    alter table sale_return_details 
       drop constraint FK7pymn8afwvefhvc4jis003cwe
;
    
    alter table sale_return_details 
       drop constraint FK1tfngrot8ca134b7qeobxfgja
;
    
    alter table sale_returns 
       drop constraint FKlxi6530aigpci1gfjnhk7gq6y
;
    
    alter table sale_returns 
       drop constraint FKo1brvqt2p5v2fq6jk8jd6b3v4
;
    
    alter table sale_returns 
       drop constraint FK1d0a6cvwatyu3oysa3qiyem7f
;
    
    alter table sales 
       drop constraint FKbbif9cb3ecyusyms54yvwlhd5
;
    
    alter table sales 
       drop constraint FK5bgaw8g0rrbqdvafq36g58smk
;
    
    alter table sales 
       drop constraint FKhf9hp5u4um5na1qrld83f70l2
;
    
    alter table settings 
       drop constraint FKh0ckbipyrqgc13y4tm55a25xx
;
    
    alter table settings 
       drop constraint FKg4h5v1r2l88vmwpd8e54id19v
;
    
    alter table settings 
       drop constraint FKovtcjwa3cwvu1h6ywcmm5uc8v
;
    
    alter table transfer_details 
       drop constraint FKi2rtqu7atovkpcfbbdv2qfibg
;
    
    alter table transfer_details 
       drop constraint FKqh3r55166n1cn6du14puixl3q
;
    
    alter table transfer_details 
       drop constraint FKhk1fvu2o6m083ox9tehqexn60
;
    
    alter table transfer_details 
       drop constraint FKiamx66lymmqbnjfy7x3hahabh
;
    
    alter table transfers 
       drop constraint FKcvgnuaekhfu7jkgfdjr2rsy6w
;
    
    alter table transfers 
       drop constraint FKij5isx8s41sjka4vdo2xwvfk0
;
    
    alter table transfers 
       drop constraint FK7m5unyo9bjegg5d48k1y94w0w
;
    
    alter table units 
       drop constraint FKbt2bv4sx8vh6ochwa9vwx5cmd
;
  */ 
  
  /* 
    drop table if exists adjustment_details cascade
;
    
    drop table if exists adjustments cascade
;
    
    drop table if exists brands cascade
;
    
    drop table if exists categories cascade
;
    
    drop table if exists clients cascade
;
    
    drop table if exists currencies cascade
;
    
    drop table if exists expense_categories cascade
;
    
    drop table if exists expenses cascade
;
    
    drop table if exists migrations cascade
;
    
    drop table if exists password_resets cascade
;
    
    drop table if exists payment_purchase_returns cascade
;
    
    drop table if exists payment_purchases cascade
;
    
    drop table if exists payment_sale_returns cascade
;
    
    drop table if exists payment_sales cascade
;
    
    drop table if exists payment_with_credit_card cascade
;
    
    drop table if exists permission_role cascade
;
    
    drop table if exists permissions cascade
;
    
    drop table if exists pos_settings cascade
;
    
    drop table if exists product_variants cascade
;
    
    drop table if exists product_warehouse cascade
;
    
    drop table if exists products cascade
;
    
    drop table if exists providers cascade
;
    
    drop table if exists purchase_details cascade
;
    
    drop table if exists purchase_return_details cascade
;
    
    drop table if exists purchase_returns cascade
;
    
    drop table if exists purchases cascade
;
    
    drop table if exists quotation_details cascade
;
    
    drop table if exists quotations cascade
;
    
    drop table if exists role_user cascade
;
    
    drop table if exists roles cascade
;
    
    drop table if exists sale_details cascade
;
    
    drop table if exists sale_return_details cascade
;
    
    drop table if exists sale_returns cascade
;
    
    drop table if exists sales cascade
;
    
    drop table if exists servers cascade
;
    
    drop table if exists settings cascade
;
    
    drop table if exists transfer_details cascade
;
    
    drop table if exists transfers cascade
;
    
    drop table if exists units cascade
;
    
    drop table if exists users cascade
;
    
    drop table if exists warehouses cascade
;
   */ 
    create table adjustment_details (
       id int8 not null,
        created_at timestamp,
        quantity float8 not null,
        type varchar(192) not null,
        updated_at timestamp,
        adjustment_id int8 not null,
        product_variant_id int8,
        product_id int8 not null,
        primary key (id)
    )
;
    
    create table adjustments (
       id int8 not null,
        created_at timestamp,
        date date not null,
        deleted_at timestamp,
        items float8,
        notes varchar(255),
        ref varchar(192) not null,
        updated_at timestamp,
        user_id int8 not null,
        warehouse_id int8 not null,
        primary key (id)
    )
;
    
    create table brands (
       id int8 not null,
        created_at timestamp,
        deleted_at timestamp,
        description varchar(192),
        image varchar(192),
        name varchar(192) not null,
        updated_at timestamp,
        primary key (id)
    )
;
    
    create table categories (
       id int8 not null,
        code varchar(192) not null,
        created_at timestamp,
        deleted_at timestamp,
        name varchar(192) not null,
        updated_at timestamp,
        primary key (id)
    )
;
    
    create table clients (
       id int8 not null,
        adresse varchar(191) not null,
        city varchar(191) not null,
        code int8 not null,
        country varchar(191) not null,
        created_at timestamp,
        deleted_at timestamp,
        email varchar(192) not null,
        name varchar(191) not null,
        phone varchar(191) not null,
        updated_at timestamp,
        primary key (id)
    )
;
    
    create table currencies (
       id int8 not null,
        code varchar(192) not null,
        created_at timestamp,
        deleted_at timestamp,
        name varchar(192) not null,
        symbol varchar(192) not null,
        updated_at timestamp,
        primary key (id)
    )
;
    
    create table expense_categories (
       id int8 not null,
        created_at timestamp,
        deleted_at timestamp,
        description varchar(255),
        name varchar(192) not null,
        updated_at timestamp,
        user_id int8 not null,
        primary key (id)
    )
;
    
    create table expenses (
       id int8 not null,
        amount float8 not null,
        created_at timestamp,
        date date not null,
        deleted_at timestamp,
        details varchar(192) not null,
        ref varchar(192) not null,
        updated_at timestamp,
        expense_category_id int8 not null,
        user_id int8 not null,
        warehouse_id int8 not null,
        primary key (id)
    )
;
    
    create table migrations (
       id int8 not null,
        batch int8 not null,
        migration varchar(191) not null,
        primary key (id)
    )
;
    
    create table password_resets (
       id int8 not null,
        created_at timestamp,
        email varchar(191) not null,
        token varchar(191) not null,
        updated_at timestamp,
        primary key (id)
    )
;
    
    create table payment_purchase_returns (
       id int8 not null,
        change float8 not null,
        created_at timestamp,
        date date not null,
        deleted_at timestamp,
        montant float8 not null,
        notes varchar(255),
        ref varchar(192) not null,
        reglement varchar(191) not null,
        updated_at timestamp,
        purchase_return_id int8 not null,
        user_id int8 not null,
        primary key (id)
    )
;
    
    create table payment_purchases (
       id int8 not null,
        change float8 not null,
        created_at timestamp,
        date date not null,
        deleted_at timestamp,
        montant float8 not null,
        notes varchar(255),
        ref varchar(192) not null,
        reglement varchar(192) not null,
        updated_at timestamp,
        purchase_id int8 not null,
        user_id int8 not null,
        primary key (id)
    )
;
    
    create table payment_sale_returns (
       id int8 not null,
        change float8 not null,
        created_at timestamp,
        date date not null,
        deleted_at timestamp,
        montant float8 not null,
        notes varchar(255),
        ref varchar(192) not null,
        reglement varchar(191) not null,
        updated_at timestamp,
        sale_return_id int8 not null,
        user_id int8 not null,
        primary key (id)
    )
;
    
    create table payment_sales (
       id int8 not null,
        change float8 not null,
        created_at timestamp,
        date date not null,
        deleted_at timestamp,
        montant float8 not null,
        notes varchar(255),
        ref varchar(192) not null,
        reglement varchar(192) not null,
        updated_at timestamp,
        sale_id int8 not null,
        user_id int8 not null,
        primary key (id)
    )
;
    
    create table payment_with_credit_card (
       id int8 not null,
        charge_id varchar(192) not null,
        created_at timestamp,
        customer_id int8 not null,
        customer_stripe_id varchar(192) not null,
        payment_id int8 not null,
        updated_at timestamp,
        primary key (id)
    )
;
    
    create table permission_role (
       id int8 not null,
        permission_id int8 not null,
        role_id int8 not null,
        primary key (id)
    )
;
    
    create table permissions (
       id int8 not null,
        created_at timestamp,
        deleted_at timestamp,
        description varchar(255),
        label varchar(192),
        name varchar(192) not null,
        updated_at timestamp,
        primary key (id)
    )
;
    
    create table pos_settings (
       id int8 not null,
        created_at timestamp,
        deleted_at timestamp,
        note_customer varchar(192) not null,
        show_address int2 not null,
        show_barcode int2 not null,
        show_customer int2 not null,
        show_discount int2 not null,
        show_email int2 not null,
        show_note int2 not null,
        show_phone int2 not null,
        updated_at timestamp,
        primary key (id)
    )
;
    
    create table product_variants (
       id int8 not null,
        created_at timestamp,
        deleted_at timestamp,
        name varchar(192),
        qty numeric(8, 0),
        updated_at timestamp,
        product_id int8,
        primary key (id)
    )
;
    
    create table product_warehouse (
       id int8 not null,
        created_at timestamp,
        deleted_at timestamp,
        qte float8 not null,
        updated_at timestamp,
        product_variant_id int8,
        product_id int8 not null,
        warehouse_id int8 not null,
        primary key (id)
    )
;
    
    create table products (
       id int8 not null,
        code varchar(192) not null,
        cost float8 not null,
        created_at timestamp,
        deleted_at timestamp,
        image varchar(255),
        is_active int2,
        is_variant int2 not null,
        name varchar(192) not null,
        note varchar(255),
        price float8 not null,
        stock_alert float8,
        tax_method varchar(192),
        taxnet float8,
        type_barcode varchar(192) not null,
        updated_at timestamp,
        brand_id int8,
        category_id int8 not null,
        unit_id int8,
        unit_purchase_id int8,
        unit_sale_id int8,
        primary key (id)
    )
;
    
    create table providers (
       id int8 not null,
        adresse varchar(191) not null,
        city varchar(191) not null,
        code int8 not null,
        country varchar(191) not null,
        created_at timestamp,
        deleted_at timestamp,
        email varchar(192) not null,
        name varchar(191) not null,
        phone varchar(192) not null,
        updated_at timestamp,
        primary key (id)
    )
;
    
    create table purchase_details (
       id int8 not null,
        cost float8 not null,
        created_at timestamp,
        discount float8,
        discount_method varchar(192),
        quantity float8 not null,
        tax_method varchar(192),
        taxnet float8,
        total float8 not null,
        updated_at timestamp,
        product_variant_id int8,
        product_id int8 not null,
        purchase_id int8 not null,
        purchase_unit_id int8,
        primary key (id)
    )
;
    
    create table purchase_return_details (
       id int8 not null,
        cost numeric(16, 3) not null,
        created_at timestamp,
        deleted_at timestamp,
        discount float8,
        discount_method varchar(192),
        quantity float8 not null,
        tax_method varchar(192),
        taxnet float8,
        total float8 not null,
        updated_at timestamp,
        product_variant_id int8,
        product_id int8 not null,
        purchase_return_id int8 not null,
        purchase_unit_id int8,
        primary key (id)
    )
;
    
    create table purchase_returns (
       id int8 not null,
        created_at timestamp,
        date date not null,
        deleted_at timestamp,
        discount float8,
        grandtotal float8 not null,
        notes varchar(255),
        paid_amount float8 not null,
        payment_statut varchar(192) not null,
        ref varchar(192) not null,
        shipping float8,
        statut varchar(192) not null,
        tax_rate float8,
        taxnet float8,
        updated_at timestamp,
        provider_id int8 not null,
        user_id int8 not null,
        warehouse_id int8 not null,
        primary key (id)
    )
;
    
    create table purchases (
       id int8 not null,
        created_at timestamp,
        date date not null,
        deleted_at timestamp,
        discount float8,
        grandtotal float8 not null,
        notes varchar(255),
        paid_amount float8 not null,
        payment_statut varchar(192) not null,
        ref varchar(192) not null,
        shipping float8,
        statut varchar(191) not null,
        tax_rate float8,
        taxnet float8,
        updated_at timestamp,
        provider_id int8 not null,
        user_id int8 not null,
        warehouse_id int8 not null,
        primary key (id)
    )
;
    
    create table quotation_details (
       id int8 not null,
        created_at timestamp,
        discount float8,
        discount_method varchar(192),
        price float8 not null,
        quantity float8 not null,
        tax_method varchar(192),
        taxnet float8,
        total float8 not null,
        updated_at timestamp,
        product_variant_id int8,
        product_id int8 not null,
        quotation_id int8 not null,
        sale_unit_id int8,
        primary key (id)
    )
;
    
    create table quotations (
       id int8 not null,
        created_at timestamp,
        date date not null,
        deleted_at timestamp,
        discount float8,
        grandtotal float8 not null,
        notes varchar(255),
        ref varchar(192) not null,
        shipping float8,
        statut varchar(192) not null,
        tax_rate float8,
        taxnet float8,
        updated_at timestamp,
        client_id int8 not null,
        user_id int8 not null,
        warehouse_id int8 not null,
        primary key (id)
    )
;
    
    create table role_user (
       id int8 not null,
        created_at timestamp,
        updated_at timestamp,
        role_id int8 not null,
        user_id int8 not null,
        primary key (id)
    )
;
    
    create table roles (
       id int8 not null,
        created_at timestamp,
        deleted_at timestamp,
        description varchar(255),
        label varchar(192),
        name varchar(192) not null,
        status int8 not null,
        updated_at timestamp,
        primary key (id)
    )
;
    
    create table sale_details (
       id int8 not null,
        created_at timestamp,
        date date not null,
        discount float8,
        discount_method varchar(192),
        price float8 not null,
        quantity float8 not null,
        tax_method varchar(192),
        taxnet float8,
        total float8 not null,
        updated_at timestamp,
        product_variant_id int8,
        product_id int8 not null,
        sale_id int8 not null,
        sale_unit_id int8,
        primary key (id)
    )
;
    
    create table sale_return_details (
       id int8 not null,
        created_at timestamp,
        discount float8,
        discount_method varchar(192),
        price float8 not null,
        quantity float8 not null,
        tax_method varchar(192),
        taxnet float8,
        total float8 not null,
        updated_at timestamp,
        product_variant_id int8,
        product_id int8 not null,
        sale_return_id int8 not null,
        sale_unit_id int8,
        primary key (id)
    )
;
    
    create table sale_returns (
       id int8 not null,
        created_at timestamp,
        date date not null,
        deleted_at timestamp,
        discount float8,
        grandtotal float8 not null,
        notes varchar(255),
        paid_amount float8 not null,
        payment_statut varchar(192) not null,
        ref varchar(192) not null,
        shipping float8,
        statut varchar(192) not null,
        tax_rate float8,
        taxnet float8,
        updated_at timestamp,
        client_id int8 not null,
        user_id int8 not null,
        warehouse_id int8 not null,
        primary key (id)
    )
;
    
    create table sales (
       id int8 not null,
        created_at timestamp,
        date date not null,
        deleted_at timestamp,
        discount float8,
        grandtotal float8 not null,
        is_pos int2,
        notes varchar(255),
        paid_amount float8 not null,
        payment_statut varchar(192) not null,
        ref varchar(192) not null,
        shipping float8,
        statut varchar(191) not null,
        tax_rate float8,
        taxnet float8,
        updated_at timestamp,
        client_id int8 not null,
        user_id int8 not null,
        warehouse_id int8 not null,
        primary key (id)
    )
;
    
    create table servers (
       id int8 not null,
        created_at timestamp,
        deleted_at timestamp,
        encryption varchar(191) not null,
        host varchar(191) not null,
        password varchar(191) not null,
        port int8 not null,
        updated_at timestamp,
        username varchar(191) not null,
        primary key (id)
    )
;
    
    create table settings (
       id int8 not null,
        companyadress varchar(191) not null,
        companyname varchar(191) not null,
        companyphone varchar(191) not null,
        created_at timestamp,
        default_language varchar(192) not null,
        deleted_at timestamp,
        developed_by varchar(192) not null,
        email varchar(191) not null,
        footer varchar(192) not null,
        logo varchar(191),
        updated_at timestamp,
        client_id int8,
        currency_id int8,
        warehouse_id int8,
        primary key (id)
    )
;
    
    create table transfer_details (
       id int8 not null,
        cost float8 not null,
        created_at timestamp,
        discount float8,
        discount_method varchar(192),
        quantity float8 not null,
        tax_method varchar(192),
        taxnet float8,
        total float8 not null,
        updated_at timestamp,
        product_variant_id int8,
        product_id int8 not null,
        transfer_id int8 not null,
        purchase_unit_id int8,
        primary key (id)
    )
;
    
    create table transfers (
       id int8 not null,
        created_at timestamp,
        date date not null,
        deleted_at timestamp,
        discount float8,
        grandtotal float8 not null,
        items float8 not null,
        notes varchar(255),
        ref varchar(192) not null,
        shipping float8,
        statut varchar(192) not null,
        tax_rate float8,
        taxnet float8,
        updated_at timestamp,
        user_id int8 not null,
        from_warehouse_id int8 not null,
        to_warehouse_id int8 not null,
        primary key (id)
    )
;
    
    create table units (
       id int8 not null,
        created_at timestamp,
        deleted_at timestamp,
        name varchar(192) not null,
        operator varchar(192),
        operator_value float8,
        shortname varchar(192) not null,
        updated_at timestamp,
        base_unit int8,
        primary key (id)
    )
;
    
    create table users (
       id int8 not null,
        avatar varchar(191),
        created_at timestamp,
        deleted_at timestamp,
        email varchar(192) not null,
        firstname varchar(191) not null,
        lastname varchar(191) not null,
        password varchar(191) not null,
        phone varchar(192) not null,
        role_id int8 not null,
        statut int2 not null,
        updated_at timestamp,
        username varchar(192) not null,
        primary key (id)
    )
;
    
    create table warehouses (
       id int8 not null,
        city varchar(192),
        country varchar(192),
        created_at timestamp,
        deleted_at timestamp,
        email varchar(192),
        mobile varchar(192),
        name varchar(192) not null,
        updated_at timestamp,
        zip varchar(192),
        primary key (id)
    )
;
    
    alter table adjustment_details 
       add constraint FKjmc25dl1ldwc8ejipi7ydy3dk 
       foreign key (adjustment_id) 
       references adjustments
;
    
    alter table adjustment_details 
       add constraint FK44cq3qaq6w2akqveahjv1qq54 
       foreign key (product_variant_id) 
       references product_variants
;
    
    alter table adjustment_details 
       add constraint FK29474utthbh5so4bkix6d00pd 
       foreign key (product_id) 
       references products
;
    
    alter table adjustments 
       add constraint FKblce0mpmgcocmguvnva8ofo1s 
       foreign key (user_id) 
       references users
;
    
    alter table adjustments 
       add constraint FK8cmjqeon67gbb8xk8ues2v4u 
       foreign key (warehouse_id) 
       references warehouses
;
    
    alter table expense_categories 
       add constraint FKjbcw6agqb7ya6s33yrxfe4ymp 
       foreign key (user_id) 
       references users
;
    
    alter table expenses 
       add constraint FK62n5q2inmp5rpeugm0pny5qp1 
       foreign key (expense_category_id) 
       references expense_categories
;
    
    alter table expenses 
       add constraint FKhpk0n2cbnfiuu5nrgl0ika3hq 
       foreign key (user_id) 
       references users
;
    
    alter table expenses 
       add constraint FKky2fd53k1f85rdtkpyyimy9li 
       foreign key (warehouse_id) 
       references warehouses
;
    
    alter table payment_purchase_returns 
       add constraint FKo70wjwtevap1rvsfraxhbdjnq 
       foreign key (purchase_return_id) 
       references purchase_returns
;
    
    alter table payment_purchase_returns 
       add constraint FKs00nu29ftrlrj88nefke2cxn0 
       foreign key (user_id) 
       references users
;
    
    alter table payment_purchases 
       add constraint FKpbq8vv1l2uiieragfbuvigddq 
       foreign key (purchase_id) 
       references purchases
;
    
    alter table payment_purchases 
       add constraint FK98sehhe1g1i7jla6xt7dhpn34 
       foreign key (user_id) 
       references users
;
    
    alter table payment_sale_returns 
       add constraint FKqb0h1qwj9dc6ytrqq0af3ncwm 
       foreign key (sale_return_id) 
       references sale_returns
;
    
    alter table payment_sale_returns 
       add constraint FK840y3ilxt1br9j6t7p9yeabw5 
       foreign key (user_id) 
       references users
;
    
    alter table payment_sales 
       add constraint FKfkoaea5b43flsv20nfyagv3u 
       foreign key (sale_id) 
       references sales
;
    
    alter table payment_sales 
       add constraint FKgolnmnuuifqd52s0h5q7tpap8 
       foreign key (user_id) 
       references users
;
    
    alter table permission_role 
       add constraint FK6mg4g9rc8u87l0yavf8kjut05 
       foreign key (permission_id) 
       references permissions
;
    
    alter table permission_role 
       add constraint FK3vhflqw0lwbwn49xqoivrtugt 
       foreign key (role_id) 
       references roles
;
    
    alter table product_variants 
       add constraint FKosqitn4s405cynmhb87lkvuau 
       foreign key (product_id) 
       references products
;
    
    alter table product_warehouse 
       add constraint FKflvceifyxftlw7a7kfxkjfw4y 
       foreign key (product_variant_id) 
       references product_variants
;
    
    alter table product_warehouse 
       add constraint FK8mm3bmktx4ipfnkk1r72d2qqf 
       foreign key (product_id) 
       references products
;
    
    alter table product_warehouse 
       add constraint FKb079c7n0iwp9kyhxg05ilawqa 
       foreign key (warehouse_id) 
       references warehouses
;
    
    alter table products 
       add constraint FKa3a4mpsfdf4d2y6r8ra3sc8mv 
       foreign key (brand_id) 
       references brands
;
    
    alter table products 
       add constraint FKog2rp4qthbtt2lfyhfo32lsw9 
       foreign key (category_id) 
       references categories
;
    
    alter table products 
       add constraint FKeex0i50vfsa5imebrfdiyhmp9 
       foreign key (unit_id) 
       references units
;
    
    alter table products 
       add constraint FKh366vywndv4pijim81ul56747 
       foreign key (unit_purchase_id) 
       references units
;
    
    alter table products 
       add constraint FKr1e7sd726jtaifeam5h2i10pk 
       foreign key (unit_sale_id) 
       references units
;
    
    alter table purchase_details 
       add constraint FKdardplwswx5axlhgub8gi3dxr 
       foreign key (product_variant_id) 
       references product_variants
;
    
    alter table purchase_details 
       add constraint FKcxl0u6f0whli7bhn1q8ja0ba3 
       foreign key (product_id) 
       references products
;
    
    alter table purchase_details 
       add constraint FK8nalokyn4ap9ebeo5hjjximls 
       foreign key (purchase_id) 
       references purchases
;
    
    alter table purchase_details 
       add constraint FKb73jher2ahwkm3ufsfbjp8qrl 
       foreign key (purchase_unit_id) 
       references units
;
    
    alter table purchase_return_details 
       add constraint FKi1m8x9qbs31gmgk48lercfh60 
       foreign key (product_variant_id) 
       references product_variants
;
    
    alter table purchase_return_details 
       add constraint FK7tta5uxl8ii1e0triierd1lwo 
       foreign key (product_id) 
       references products
;
    
    alter table purchase_return_details 
       add constraint FKom8y1bsv0fojd4bt5kgfhvbw8 
       foreign key (purchase_return_id) 
       references purchase_returns
;
    
    alter table purchase_return_details 
       add constraint FKslcedf3s0jqjuflg9eonve6q3 
       foreign key (purchase_unit_id) 
       references units
;
    
    alter table purchase_returns 
       add constraint FK23hv85p8q8v08hood6el3jffx 
       foreign key (provider_id) 
       references providers
;
    
    alter table purchase_returns 
       add constraint FK8yvur48mh0n46de69uaojgbyw 
       foreign key (user_id) 
       references users
;
    
    alter table purchase_returns 
       add constraint FKihwyabpeahrl2yv7ivjflrxlj 
       foreign key (warehouse_id) 
       references warehouses
;
    
    alter table purchases 
       add constraint FKbn2k5burari3lcgietiifq9ho 
       foreign key (provider_id) 
       references providers
;
    
    alter table purchases 
       add constraint FKm0ndjymn9p747pfp4515pio8i 
       foreign key (user_id) 
       references users
;
    
    alter table purchases 
       add constraint FKo5ayqstf3r4ec39aykkavuscp 
       foreign key (warehouse_id) 
       references warehouses
;
    
    alter table quotation_details 
       add constraint FK47semmwcknt178jtvifd67pii 
       foreign key (product_variant_id) 
       references product_variants
;
    
    alter table quotation_details 
       add constraint FKaqydkynkh434ifin8tw1jehq6 
       foreign key (product_id) 
       references products
;
    
    alter table quotation_details 
       add constraint FKolxi2hah5a2praypvlyrxmiov 
       foreign key (quotation_id) 
       references quotations
;
    
    alter table quotation_details 
       add constraint FKn4iu0kt443iyv8m6s04h5h0md 
       foreign key (sale_unit_id) 
       references units
;
    
    alter table quotations 
       add constraint FKn8qu972xetsfvcj0atbsbxj6t 
       foreign key (client_id) 
       references clients
;
    
    alter table quotations 
       add constraint FKj3s7ongcvjncktb1xnyvrns07 
       foreign key (user_id) 
       references users
;
    
    alter table quotations 
       add constraint FKl4y8f5ujgi3fs653menqyw0j2 
       foreign key (warehouse_id) 
       references warehouses
;
    
    alter table role_user 
       add constraint FK7tjfd3wunlpu0di6qpu5asgen 
       foreign key (role_id) 
       references roles
;
    
    alter table role_user 
       add constraint FKhvai2k29vlwpt9wod4sw4ghmn 
       foreign key (user_id) 
       references users
;
    
    alter table sale_details 
       add constraint FKmu5mqpa8wg2m2ukufbchdacdm 
       foreign key (product_variant_id) 
       references product_variants
;
    
    alter table sale_details 
       add constraint FKqvh82ispfukxa2yssnok0m12o 
       foreign key (product_id) 
       references products
;
    
    alter table sale_details 
       add constraint FK6nruj5m7ntwhc29etigqnlk0m 
       foreign key (sale_id) 
       references sales
;
    
    alter table sale_details 
       add constraint FKbsd5fduysox0fquwcasmr88og 
       foreign key (sale_unit_id) 
       references units
;
    
    alter table sale_return_details 
       add constraint FKlfanga77ry7m7rg0ae6rbs8su 
       foreign key (product_variant_id) 
       references product_variants
;
    
    alter table sale_return_details 
       add constraint FK6cv7g4chqvnbn0d08ken9am8u 
       foreign key (product_id) 
       references products
;
    
    alter table sale_return_details 
       add constraint FK7pymn8afwvefhvc4jis003cwe 
       foreign key (sale_return_id) 
       references sale_returns
;
    
    alter table sale_return_details 
       add constraint FK1tfngrot8ca134b7qeobxfgja 
       foreign key (sale_unit_id) 
       references units
;
    
    alter table sale_returns 
       add constraint FKlxi6530aigpci1gfjnhk7gq6y 
       foreign key (client_id) 
       references clients
;
    
    alter table sale_returns 
       add constraint FKo1brvqt2p5v2fq6jk8jd6b3v4 
       foreign key (user_id) 
       references users
;
    
    alter table sale_returns 
       add constraint FK1d0a6cvwatyu3oysa3qiyem7f 
       foreign key (warehouse_id) 
       references warehouses
;
    
    alter table sales 
       add constraint FKbbif9cb3ecyusyms54yvwlhd5 
       foreign key (client_id) 
       references clients
;
    
    alter table sales 
       add constraint FK5bgaw8g0rrbqdvafq36g58smk 
       foreign key (user_id) 
       references users
;
    
    alter table sales 
       add constraint FKhf9hp5u4um5na1qrld83f70l2 
       foreign key (warehouse_id) 
       references warehouses
;
    
    alter table settings 
       add constraint FKh0ckbipyrqgc13y4tm55a25xx 
       foreign key (client_id) 
       references clients
;
    
    alter table settings 
       add constraint FKg4h5v1r2l88vmwpd8e54id19v 
       foreign key (currency_id) 
       references currencies
;
    
    alter table settings 
       add constraint FKovtcjwa3cwvu1h6ywcmm5uc8v 
       foreign key (warehouse_id) 
       references warehouses
;
    
    alter table transfer_details 
       add constraint FKi2rtqu7atovkpcfbbdv2qfibg 
       foreign key (product_variant_id) 
       references product_variants
;
    
    alter table transfer_details 
       add constraint FKqh3r55166n1cn6du14puixl3q 
       foreign key (product_id) 
       references products
;
    
    alter table transfer_details 
       add constraint FKhk1fvu2o6m083ox9tehqexn60 
       foreign key (transfer_id) 
       references transfers
;
    
    alter table transfer_details 
       add constraint FKiamx66lymmqbnjfy7x3hahabh 
       foreign key (purchase_unit_id) 
       references units
;
    
    alter table transfers 
       add constraint FKcvgnuaekhfu7jkgfdjr2rsy6w 
       foreign key (user_id) 
       references users
;
    
    alter table transfers 
       add constraint FKij5isx8s41sjka4vdo2xwvfk0 
       foreign key (from_warehouse_id) 
       references warehouses
;
    
    alter table transfers 
       add constraint FK7m5unyo9bjegg5d48k1y94w0w 
       foreign key (to_warehouse_id) 
       references warehouses
;
    
    alter table units 
       add constraint FKbt2bv4sx8vh6ochwa9vwx5cmd 
       foreign key (base_unit) 
       references units
;