--
-- PostgreSQL database dump
--

-- Dumped from database version 14.2
-- Dumped by pg_dump version 14.2

-- Started on 2022-04-29 13:50:31

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 210 (class 1259 OID 35616)
-- Name: adjustment_details; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.adjustment_details (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    quantity double precision NOT NULL,
    type character varying(192) NOT NULL,
    updated_at timestamp without time zone,
    adjustment_id bigint NOT NULL,
    product_variant_id bigint,
    product_id bigint NOT NULL
);


ALTER TABLE public.adjustment_details OWNER TO postgres;

--
-- TOC entry 211 (class 1259 OID 35621)
-- Name: adjustments; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.adjustments (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    date date NOT NULL,
    deleted_at timestamp without time zone,
    items double precision,
    notes character varying(255),
    ref character varying(192) NOT NULL,
    updated_at timestamp without time zone,
    user_id bigint NOT NULL,
    warehouse_id bigint NOT NULL
);


ALTER TABLE public.adjustments OWNER TO postgres;

--
-- TOC entry 212 (class 1259 OID 35626)
-- Name: brands; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.brands (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    deleted_at timestamp without time zone,
    description character varying(192),
    image character varying(192),
    name character varying(192) NOT NULL,
    updated_at timestamp without time zone
);


ALTER TABLE public.brands OWNER TO postgres;

--
-- TOC entry 213 (class 1259 OID 35633)
-- Name: categories; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.categories (
    id bigint NOT NULL,
    code character varying(192) NOT NULL,
    created_at timestamp without time zone,
    deleted_at timestamp without time zone,
    name character varying(192) NOT NULL,
    updated_at timestamp without time zone
);


ALTER TABLE public.categories OWNER TO postgres;

--
-- TOC entry 214 (class 1259 OID 35638)
-- Name: clients; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.clients (
    id bigint NOT NULL,
    adresse character varying(191) NOT NULL,
    city character varying(191) NOT NULL,
    code bigint NOT NULL,
    country character varying(191) NOT NULL,
    created_at timestamp without time zone,
    deleted_at timestamp without time zone,
    email character varying(192) NOT NULL,
    name character varying(191) NOT NULL,
    phone character varying(191) NOT NULL,
    updated_at timestamp without time zone
);


ALTER TABLE public.clients OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 35645)
-- Name: currencies; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.currencies (
    id bigint NOT NULL,
    code character varying(192) NOT NULL,
    created_at timestamp without time zone,
    deleted_at timestamp without time zone,
    name character varying(192) NOT NULL,
    symbol character varying(192) NOT NULL,
    updated_at timestamp without time zone
);


ALTER TABLE public.currencies OWNER TO postgres;

--
-- TOC entry 216 (class 1259 OID 35652)
-- Name: expense_categories; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.expense_categories (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    deleted_at timestamp without time zone,
    description character varying(255),
    name character varying(192) NOT NULL,
    updated_at timestamp without time zone,
    user_id bigint NOT NULL
);


ALTER TABLE public.expense_categories OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 35657)
-- Name: expenses; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.expenses (
    id bigint NOT NULL,
    amount double precision NOT NULL,
    created_at timestamp without time zone,
    date date NOT NULL,
    deleted_at timestamp without time zone,
    details character varying(192) NOT NULL,
    ref character varying(192) NOT NULL,
    updated_at timestamp without time zone,
    expense_category_id bigint NOT NULL,
    user_id bigint NOT NULL,
    warehouse_id bigint NOT NULL
);


ALTER TABLE public.expenses OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 34978)
-- Name: hibernate_sequence; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.hibernate_sequence OWNER TO postgres;

--
-- TOC entry 218 (class 1259 OID 35662)
-- Name: migrations; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.migrations (
    id bigint NOT NULL,
    batch bigint NOT NULL,
    migration character varying(191) NOT NULL
);


ALTER TABLE public.migrations OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 35667)
-- Name: password_resets; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.password_resets (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    email character varying(191) NOT NULL,
    token character varying(191) NOT NULL,
    updated_at timestamp without time zone
);


ALTER TABLE public.password_resets OWNER TO postgres;

--
-- TOC entry 220 (class 1259 OID 35672)
-- Name: payment_purchase_returns; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.payment_purchase_returns (
    id bigint NOT NULL,
    change double precision NOT NULL,
    created_at timestamp without time zone,
    date date NOT NULL,
    deleted_at timestamp without time zone,
    montant double precision NOT NULL,
    notes character varying(255),
    ref character varying(192) NOT NULL,
    reglement character varying(191) NOT NULL,
    updated_at timestamp without time zone,
    purchase_return_id bigint NOT NULL,
    user_id bigint NOT NULL
);


ALTER TABLE public.payment_purchase_returns OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 35679)
-- Name: payment_purchases; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.payment_purchases (
    id bigint NOT NULL,
    change double precision NOT NULL,
    created_at timestamp without time zone,
    date date NOT NULL,
    deleted_at timestamp without time zone,
    montant double precision NOT NULL,
    notes character varying(255),
    ref character varying(192) NOT NULL,
    reglement character varying(192) NOT NULL,
    updated_at timestamp without time zone,
    purchase_id bigint NOT NULL,
    user_id bigint NOT NULL
);


ALTER TABLE public.payment_purchases OWNER TO postgres;

--
-- TOC entry 222 (class 1259 OID 35686)
-- Name: payment_sale_returns; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.payment_sale_returns (
    id bigint NOT NULL,
    change double precision NOT NULL,
    created_at timestamp without time zone,
    date date NOT NULL,
    deleted_at timestamp without time zone,
    montant double precision NOT NULL,
    notes character varying(255),
    ref character varying(192) NOT NULL,
    reglement character varying(191) NOT NULL,
    updated_at timestamp without time zone,
    sale_return_id bigint NOT NULL,
    user_id bigint NOT NULL
);


ALTER TABLE public.payment_sale_returns OWNER TO postgres;

--
-- TOC entry 223 (class 1259 OID 35693)
-- Name: payment_sales; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.payment_sales (
    id bigint NOT NULL,
    change double precision NOT NULL,
    created_at timestamp without time zone,
    date date NOT NULL,
    deleted_at timestamp without time zone,
    montant double precision NOT NULL,
    notes character varying(255),
    ref character varying(192) NOT NULL,
    reglement character varying(192) NOT NULL,
    updated_at timestamp without time zone,
    sale_id bigint NOT NULL,
    user_id bigint NOT NULL
);


ALTER TABLE public.payment_sales OWNER TO postgres;

--
-- TOC entry 224 (class 1259 OID 35700)
-- Name: payment_with_credit_card; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.payment_with_credit_card (
    id bigint NOT NULL,
    charge_id character varying(192) NOT NULL,
    created_at timestamp without time zone,
    customer_id bigint NOT NULL,
    customer_stripe_id character varying(192) NOT NULL,
    payment_id bigint NOT NULL,
    updated_at timestamp without time zone
);


ALTER TABLE public.payment_with_credit_card OWNER TO postgres;

--
-- TOC entry 225 (class 1259 OID 35705)
-- Name: permission_role; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.permission_role (
    id bigint NOT NULL,
    permission_id bigint NOT NULL,
    role_id bigint NOT NULL
);


ALTER TABLE public.permission_role OWNER TO postgres;

--
-- TOC entry 226 (class 1259 OID 35710)
-- Name: permissions; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.permissions (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    deleted_at timestamp without time zone,
    description character varying(255),
    label character varying(192),
    name character varying(192) NOT NULL,
    updated_at timestamp without time zone
);


ALTER TABLE public.permissions OWNER TO postgres;

--
-- TOC entry 227 (class 1259 OID 35717)
-- Name: pos_settings; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.pos_settings (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    deleted_at timestamp without time zone,
    note_customer character varying(192) NOT NULL,
    show_address smallint NOT NULL,
    show_barcode smallint NOT NULL,
    show_customer smallint NOT NULL,
    show_discount smallint NOT NULL,
    show_email smallint NOT NULL,
    show_note smallint NOT NULL,
    show_phone smallint NOT NULL,
    updated_at timestamp without time zone
);


ALTER TABLE public.pos_settings OWNER TO postgres;

--
-- TOC entry 228 (class 1259 OID 35722)
-- Name: product_variants; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.product_variants (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    deleted_at timestamp without time zone,
    name character varying(192),
    qty numeric(8,0),
    updated_at timestamp without time zone,
    product_id bigint
);


ALTER TABLE public.product_variants OWNER TO postgres;

--
-- TOC entry 229 (class 1259 OID 35727)
-- Name: product_warehouse; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.product_warehouse (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    deleted_at timestamp without time zone,
    qte double precision NOT NULL,
    updated_at timestamp without time zone,
    product_variant_id bigint,
    product_id bigint NOT NULL,
    warehouse_id bigint NOT NULL
);


ALTER TABLE public.product_warehouse OWNER TO postgres;

--
-- TOC entry 230 (class 1259 OID 35732)
-- Name: products; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.products (
    id bigint NOT NULL,
    code character varying(192) NOT NULL,
    cost double precision NOT NULL,
    created_at timestamp without time zone,
    deleted_at timestamp without time zone,
    image character varying(255),
    is_active smallint,
    is_variant smallint NOT NULL,
    name character varying(192) NOT NULL,
    note character varying(255),
    price double precision NOT NULL,
    stock_alert double precision,
    tax_method character varying(192),
    taxnet double precision,
    type_barcode character varying(192) NOT NULL,
    updated_at timestamp without time zone,
    brand_id bigint,
    category_id bigint NOT NULL,
    unit_id bigint,
    unit_purchase_id bigint,
    unit_sale_id bigint
);


ALTER TABLE public.products OWNER TO postgres;

--
-- TOC entry 231 (class 1259 OID 35739)
-- Name: providers; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.providers (
    id bigint NOT NULL,
    adresse character varying(191) NOT NULL,
    city character varying(191) NOT NULL,
    code bigint NOT NULL,
    country character varying(191) NOT NULL,
    created_at timestamp without time zone,
    deleted_at timestamp without time zone,
    email character varying(192) NOT NULL,
    name character varying(191) NOT NULL,
    phone character varying(192) NOT NULL,
    updated_at timestamp without time zone
);


ALTER TABLE public.providers OWNER TO postgres;

--
-- TOC entry 232 (class 1259 OID 35746)
-- Name: purchase_details; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.purchase_details (
    id bigint NOT NULL,
    cost double precision NOT NULL,
    created_at timestamp without time zone,
    discount double precision,
    discount_method character varying(192),
    quantity double precision NOT NULL,
    tax_method character varying(192),
    taxnet double precision,
    total double precision NOT NULL,
    updated_at timestamp without time zone,
    product_variant_id bigint,
    product_id bigint NOT NULL,
    purchase_id bigint NOT NULL,
    purchase_unit_id bigint
);


ALTER TABLE public.purchase_details OWNER TO postgres;

--
-- TOC entry 233 (class 1259 OID 35751)
-- Name: purchase_return_details; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.purchase_return_details (
    id bigint NOT NULL,
    cost numeric(16,3) NOT NULL,
    created_at timestamp without time zone,
    deleted_at timestamp without time zone,
    discount double precision,
    discount_method character varying(192),
    quantity double precision NOT NULL,
    tax_method character varying(192),
    taxnet double precision,
    total double precision NOT NULL,
    updated_at timestamp without time zone,
    product_variant_id bigint,
    product_id bigint NOT NULL,
    purchase_return_id bigint NOT NULL,
    purchase_unit_id bigint
);


ALTER TABLE public.purchase_return_details OWNER TO postgres;

--
-- TOC entry 234 (class 1259 OID 35756)
-- Name: purchase_returns; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.purchase_returns (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    date date NOT NULL,
    deleted_at timestamp without time zone,
    discount double precision,
    grandtotal double precision NOT NULL,
    notes character varying(255),
    paid_amount double precision NOT NULL,
    payment_statut character varying(192) NOT NULL,
    ref character varying(192) NOT NULL,
    shipping double precision,
    statut character varying(192) NOT NULL,
    tax_rate double precision,
    taxnet double precision,
    updated_at timestamp without time zone,
    provider_id bigint NOT NULL,
    user_id bigint NOT NULL,
    warehouse_id bigint NOT NULL
);


ALTER TABLE public.purchase_returns OWNER TO postgres;

--
-- TOC entry 235 (class 1259 OID 35763)
-- Name: purchases; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.purchases (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    date date NOT NULL,
    deleted_at timestamp without time zone,
    discount double precision,
    grandtotal double precision NOT NULL,
    notes character varying(255),
    paid_amount double precision NOT NULL,
    payment_statut character varying(192) NOT NULL,
    ref character varying(192) NOT NULL,
    shipping double precision,
    statut character varying(191) NOT NULL,
    tax_rate double precision,
    taxnet double precision,
    updated_at timestamp without time zone,
    provider_id bigint NOT NULL,
    user_id bigint NOT NULL,
    warehouse_id bigint NOT NULL
);


ALTER TABLE public.purchases OWNER TO postgres;

--
-- TOC entry 236 (class 1259 OID 35770)
-- Name: quotation_details; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.quotation_details (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    discount double precision,
    discount_method character varying(192),
    price double precision NOT NULL,
    quantity double precision NOT NULL,
    tax_method character varying(192),
    taxnet double precision,
    total double precision NOT NULL,
    updated_at timestamp without time zone,
    product_variant_id bigint,
    product_id bigint NOT NULL,
    quotation_id bigint NOT NULL,
    sale_unit_id bigint
);


ALTER TABLE public.quotation_details OWNER TO postgres;

--
-- TOC entry 237 (class 1259 OID 35775)
-- Name: quotations; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.quotations (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    date date NOT NULL,
    deleted_at timestamp without time zone,
    discount double precision,
    grandtotal double precision NOT NULL,
    notes character varying(255),
    ref character varying(192) NOT NULL,
    shipping double precision,
    statut character varying(192) NOT NULL,
    tax_rate double precision,
    taxnet double precision,
    updated_at timestamp without time zone,
    client_id bigint NOT NULL,
    user_id bigint NOT NULL,
    warehouse_id bigint NOT NULL
);


ALTER TABLE public.quotations OWNER TO postgres;

--
-- TOC entry 238 (class 1259 OID 35782)
-- Name: role_user; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.role_user (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    updated_at timestamp without time zone,
    role_id bigint NOT NULL,
    user_id bigint NOT NULL
);


ALTER TABLE public.role_user OWNER TO postgres;

--
-- TOC entry 239 (class 1259 OID 35787)
-- Name: roles; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.roles (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    deleted_at timestamp without time zone,
    description character varying(255),
    label character varying(192),
    name character varying(192) NOT NULL,
    status bigint NOT NULL,
    updated_at timestamp without time zone
);


ALTER TABLE public.roles OWNER TO postgres;

--
-- TOC entry 240 (class 1259 OID 35794)
-- Name: sale_details; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.sale_details (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    date date NOT NULL,
    discount double precision,
    discount_method character varying(192),
    price double precision NOT NULL,
    quantity double precision NOT NULL,
    tax_method character varying(192),
    taxnet double precision,
    total double precision NOT NULL,
    updated_at timestamp without time zone,
    product_variant_id bigint,
    product_id bigint NOT NULL,
    sale_id bigint NOT NULL,
    sale_unit_id bigint
);


ALTER TABLE public.sale_details OWNER TO postgres;

--
-- TOC entry 241 (class 1259 OID 35799)
-- Name: sale_return_details; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.sale_return_details (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    discount double precision,
    discount_method character varying(192),
    price double precision NOT NULL,
    quantity double precision NOT NULL,
    tax_method character varying(192),
    taxnet double precision,
    total double precision NOT NULL,
    updated_at timestamp without time zone,
    product_variant_id bigint,
    product_id bigint NOT NULL,
    sale_return_id bigint NOT NULL,
    sale_unit_id bigint
);


ALTER TABLE public.sale_return_details OWNER TO postgres;

--
-- TOC entry 242 (class 1259 OID 35804)
-- Name: sale_returns; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.sale_returns (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    date date NOT NULL,
    deleted_at timestamp without time zone,
    discount double precision,
    grandtotal double precision NOT NULL,
    notes character varying(255),
    paid_amount double precision NOT NULL,
    payment_statut character varying(192) NOT NULL,
    ref character varying(192) NOT NULL,
    shipping double precision,
    statut character varying(192) NOT NULL,
    tax_rate double precision,
    taxnet double precision,
    updated_at timestamp without time zone,
    client_id bigint NOT NULL,
    user_id bigint NOT NULL,
    warehouse_id bigint NOT NULL
);


ALTER TABLE public.sale_returns OWNER TO postgres;

--
-- TOC entry 243 (class 1259 OID 35811)
-- Name: sales; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.sales (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    date date NOT NULL,
    deleted_at timestamp without time zone,
    discount double precision,
    grandtotal double precision NOT NULL,
    is_pos smallint,
    notes character varying(255),
    paid_amount double precision NOT NULL,
    payment_statut character varying(192) NOT NULL,
    ref character varying(192) NOT NULL,
    shipping double precision,
    statut character varying(191) NOT NULL,
    tax_rate double precision,
    taxnet double precision,
    updated_at timestamp without time zone,
    client_id bigint NOT NULL,
    user_id bigint NOT NULL,
    warehouse_id bigint NOT NULL
);


ALTER TABLE public.sales OWNER TO postgres;

--
-- TOC entry 244 (class 1259 OID 35818)
-- Name: servers; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.servers (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    deleted_at timestamp without time zone,
    encryption character varying(191) NOT NULL,
    host character varying(191) NOT NULL,
    password character varying(191) NOT NULL,
    port bigint NOT NULL,
    updated_at timestamp without time zone,
    username character varying(191) NOT NULL
);


ALTER TABLE public.servers OWNER TO postgres;

--
-- TOC entry 245 (class 1259 OID 35825)
-- Name: settings; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.settings (
    id bigint NOT NULL,
    companyadress character varying(191) NOT NULL,
    companyname character varying(191) NOT NULL,
    companyphone character varying(191) NOT NULL,
    created_at timestamp without time zone,
    default_language character varying(192) NOT NULL,
    deleted_at timestamp without time zone,
    developed_by character varying(192) NOT NULL,
    email character varying(191) NOT NULL,
    footer character varying(192) NOT NULL,
    logo character varying(191),
    updated_at timestamp without time zone,
    client_id bigint,
    currency_id bigint,
    warehouse_id bigint
);


ALTER TABLE public.settings OWNER TO postgres;

--
-- TOC entry 246 (class 1259 OID 35832)
-- Name: transfer_details; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.transfer_details (
    id bigint NOT NULL,
    cost double precision NOT NULL,
    created_at timestamp without time zone,
    discount double precision,
    discount_method character varying(192),
    quantity double precision NOT NULL,
    tax_method character varying(192),
    taxnet double precision,
    total double precision NOT NULL,
    updated_at timestamp without time zone,
    product_variant_id bigint,
    product_id bigint NOT NULL,
    transfer_id bigint NOT NULL,
    purchase_unit_id bigint
);


ALTER TABLE public.transfer_details OWNER TO postgres;

--
-- TOC entry 247 (class 1259 OID 35837)
-- Name: transfers; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.transfers (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    date date NOT NULL,
    deleted_at timestamp without time zone,
    discount double precision,
    grandtotal double precision NOT NULL,
    items double precision NOT NULL,
    notes character varying(255),
    ref character varying(192) NOT NULL,
    shipping double precision,
    statut character varying(192) NOT NULL,
    tax_rate double precision,
    taxnet double precision,
    updated_at timestamp without time zone,
    user_id bigint NOT NULL,
    from_warehouse_id bigint NOT NULL,
    to_warehouse_id bigint NOT NULL
);


ALTER TABLE public.transfers OWNER TO postgres;

--
-- TOC entry 248 (class 1259 OID 35844)
-- Name: units; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.units (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    deleted_at timestamp without time zone,
    name character varying(192) NOT NULL,
    operator character varying(192),
    operator_value double precision,
    shortname character varying(192) NOT NULL,
    updated_at timestamp without time zone,
    base_unit bigint
);


ALTER TABLE public.units OWNER TO postgres;

--
-- TOC entry 249 (class 1259 OID 35851)
-- Name: users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.users (
    id bigint NOT NULL,
    avatar character varying(191),
    created_at timestamp without time zone,
    deleted_at timestamp without time zone,
    email character varying(192) NOT NULL,
    firstname character varying(191) NOT NULL,
    lastname character varying(191) NOT NULL,
    password character varying(191) NOT NULL,
    phone character varying(192) NOT NULL,
    role_id bigint NOT NULL,
    statut smallint NOT NULL,
    updated_at timestamp without time zone,
    username character varying(192) NOT NULL
);


ALTER TABLE public.users OWNER TO postgres;

--
-- TOC entry 250 (class 1259 OID 35858)
-- Name: warehouses; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.warehouses (
    id bigint NOT NULL,
    city character varying(192),
    country character varying(192),
    created_at timestamp without time zone,
    deleted_at timestamp without time zone,
    email character varying(192),
    mobile character varying(192),
    name character varying(192) NOT NULL,
    updated_at timestamp without time zone,
    zip character varying(192)
);


ALTER TABLE public.warehouses OWNER TO postgres;

--
-- TOC entry 3325 (class 2606 OID 35620)
-- Name: adjustment_details adjustment_details_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.adjustment_details
    ADD CONSTRAINT adjustment_details_pkey PRIMARY KEY (id);


--
-- TOC entry 3327 (class 2606 OID 35625)
-- Name: adjustments adjustments_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.adjustments
    ADD CONSTRAINT adjustments_pkey PRIMARY KEY (id);


--
-- TOC entry 3329 (class 2606 OID 35632)
-- Name: brands brands_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.brands
    ADD CONSTRAINT brands_pkey PRIMARY KEY (id);


--
-- TOC entry 3331 (class 2606 OID 35637)
-- Name: categories categories_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.categories
    ADD CONSTRAINT categories_pkey PRIMARY KEY (id);


--
-- TOC entry 3333 (class 2606 OID 35644)
-- Name: clients clients_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clients
    ADD CONSTRAINT clients_pkey PRIMARY KEY (id);


--
-- TOC entry 3335 (class 2606 OID 35651)
-- Name: currencies currencies_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.currencies
    ADD CONSTRAINT currencies_pkey PRIMARY KEY (id);


--
-- TOC entry 3337 (class 2606 OID 35656)
-- Name: expense_categories expense_categories_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.expense_categories
    ADD CONSTRAINT expense_categories_pkey PRIMARY KEY (id);


--
-- TOC entry 3339 (class 2606 OID 35661)
-- Name: expenses expenses_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.expenses
    ADD CONSTRAINT expenses_pkey PRIMARY KEY (id);


--
-- TOC entry 3341 (class 2606 OID 35666)
-- Name: migrations migrations_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.migrations
    ADD CONSTRAINT migrations_pkey PRIMARY KEY (id);


--
-- TOC entry 3343 (class 2606 OID 35671)
-- Name: password_resets password_resets_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.password_resets
    ADD CONSTRAINT password_resets_pkey PRIMARY KEY (id);


--
-- TOC entry 3345 (class 2606 OID 35678)
-- Name: payment_purchase_returns payment_purchase_returns_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.payment_purchase_returns
    ADD CONSTRAINT payment_purchase_returns_pkey PRIMARY KEY (id);


--
-- TOC entry 3347 (class 2606 OID 35685)
-- Name: payment_purchases payment_purchases_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.payment_purchases
    ADD CONSTRAINT payment_purchases_pkey PRIMARY KEY (id);


--
-- TOC entry 3349 (class 2606 OID 35692)
-- Name: payment_sale_returns payment_sale_returns_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.payment_sale_returns
    ADD CONSTRAINT payment_sale_returns_pkey PRIMARY KEY (id);


--
-- TOC entry 3351 (class 2606 OID 35699)
-- Name: payment_sales payment_sales_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.payment_sales
    ADD CONSTRAINT payment_sales_pkey PRIMARY KEY (id);


--
-- TOC entry 3353 (class 2606 OID 35704)
-- Name: payment_with_credit_card payment_with_credit_card_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.payment_with_credit_card
    ADD CONSTRAINT payment_with_credit_card_pkey PRIMARY KEY (id);


--
-- TOC entry 3355 (class 2606 OID 35709)
-- Name: permission_role permission_role_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.permission_role
    ADD CONSTRAINT permission_role_pkey PRIMARY KEY (id);


--
-- TOC entry 3357 (class 2606 OID 35716)
-- Name: permissions permissions_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.permissions
    ADD CONSTRAINT permissions_pkey PRIMARY KEY (id);


--
-- TOC entry 3359 (class 2606 OID 35721)
-- Name: pos_settings pos_settings_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pos_settings
    ADD CONSTRAINT pos_settings_pkey PRIMARY KEY (id);


--
-- TOC entry 3361 (class 2606 OID 35726)
-- Name: product_variants product_variants_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.product_variants
    ADD CONSTRAINT product_variants_pkey PRIMARY KEY (id);


--
-- TOC entry 3363 (class 2606 OID 35731)
-- Name: product_warehouse product_warehouse_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.product_warehouse
    ADD CONSTRAINT product_warehouse_pkey PRIMARY KEY (id);


--
-- TOC entry 3365 (class 2606 OID 35738)
-- Name: products products_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.products
    ADD CONSTRAINT products_pkey PRIMARY KEY (id);


--
-- TOC entry 3367 (class 2606 OID 35745)
-- Name: providers providers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.providers
    ADD CONSTRAINT providers_pkey PRIMARY KEY (id);


--
-- TOC entry 3369 (class 2606 OID 35750)
-- Name: purchase_details purchase_details_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.purchase_details
    ADD CONSTRAINT purchase_details_pkey PRIMARY KEY (id);


--
-- TOC entry 3371 (class 2606 OID 35755)
-- Name: purchase_return_details purchase_return_details_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.purchase_return_details
    ADD CONSTRAINT purchase_return_details_pkey PRIMARY KEY (id);


--
-- TOC entry 3373 (class 2606 OID 35762)
-- Name: purchase_returns purchase_returns_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.purchase_returns
    ADD CONSTRAINT purchase_returns_pkey PRIMARY KEY (id);


--
-- TOC entry 3375 (class 2606 OID 35769)
-- Name: purchases purchases_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.purchases
    ADD CONSTRAINT purchases_pkey PRIMARY KEY (id);


--
-- TOC entry 3377 (class 2606 OID 35774)
-- Name: quotation_details quotation_details_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.quotation_details
    ADD CONSTRAINT quotation_details_pkey PRIMARY KEY (id);


--
-- TOC entry 3379 (class 2606 OID 35781)
-- Name: quotations quotations_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.quotations
    ADD CONSTRAINT quotations_pkey PRIMARY KEY (id);


--
-- TOC entry 3381 (class 2606 OID 35786)
-- Name: role_user role_user_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.role_user
    ADD CONSTRAINT role_user_pkey PRIMARY KEY (id);


--
-- TOC entry 3383 (class 2606 OID 35793)
-- Name: roles roles_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.roles
    ADD CONSTRAINT roles_pkey PRIMARY KEY (id);


--
-- TOC entry 3385 (class 2606 OID 35798)
-- Name: sale_details sale_details_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sale_details
    ADD CONSTRAINT sale_details_pkey PRIMARY KEY (id);


--
-- TOC entry 3387 (class 2606 OID 35803)
-- Name: sale_return_details sale_return_details_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sale_return_details
    ADD CONSTRAINT sale_return_details_pkey PRIMARY KEY (id);


--
-- TOC entry 3389 (class 2606 OID 35810)
-- Name: sale_returns sale_returns_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sale_returns
    ADD CONSTRAINT sale_returns_pkey PRIMARY KEY (id);


--
-- TOC entry 3391 (class 2606 OID 35817)
-- Name: sales sales_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sales
    ADD CONSTRAINT sales_pkey PRIMARY KEY (id);


--
-- TOC entry 3393 (class 2606 OID 35824)
-- Name: servers servers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.servers
    ADD CONSTRAINT servers_pkey PRIMARY KEY (id);


--
-- TOC entry 3395 (class 2606 OID 35831)
-- Name: settings settings_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.settings
    ADD CONSTRAINT settings_pkey PRIMARY KEY (id);


--
-- TOC entry 3397 (class 2606 OID 35836)
-- Name: transfer_details transfer_details_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.transfer_details
    ADD CONSTRAINT transfer_details_pkey PRIMARY KEY (id);


--
-- TOC entry 3399 (class 2606 OID 35843)
-- Name: transfers transfers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.transfers
    ADD CONSTRAINT transfers_pkey PRIMARY KEY (id);


--
-- TOC entry 3401 (class 2606 OID 35850)
-- Name: units units_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.units
    ADD CONSTRAINT units_pkey PRIMARY KEY (id);


--
-- TOC entry 3403 (class 2606 OID 35857)
-- Name: users users_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);


--
-- TOC entry 3405 (class 2606 OID 35864)
-- Name: warehouses warehouses_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.warehouses
    ADD CONSTRAINT warehouses_pkey PRIMARY KEY (id);


--
-- TOC entry 3467 (class 2606 OID 36170)
-- Name: sale_returns fk1d0a6cvwatyu3oysa3qiyem7f; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sale_returns
    ADD CONSTRAINT fk1d0a6cvwatyu3oysa3qiyem7f FOREIGN KEY (warehouse_id) REFERENCES public.warehouses(id);


--
-- TOC entry 3464 (class 2606 OID 36155)
-- Name: sale_return_details fk1tfngrot8ca134b7qeobxfgja; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sale_return_details
    ADD CONSTRAINT fk1tfngrot8ca134b7qeobxfgja FOREIGN KEY (sale_unit_id) REFERENCES public.units(id);


--
-- TOC entry 3442 (class 2606 OID 36045)
-- Name: purchase_returns fk23hv85p8q8v08hood6el3jffx; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.purchase_returns
    ADD CONSTRAINT fk23hv85p8q8v08hood6el3jffx FOREIGN KEY (provider_id) REFERENCES public.providers(id);


--
-- TOC entry 3408 (class 2606 OID 35875)
-- Name: adjustment_details fk29474utthbh5so4bkix6d00pd; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.adjustment_details
    ADD CONSTRAINT fk29474utthbh5so4bkix6d00pd FOREIGN KEY (product_id) REFERENCES public.products(id);


--
-- TOC entry 3424 (class 2606 OID 35955)
-- Name: permission_role fk3vhflqw0lwbwn49xqoivrtugt; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.permission_role
    ADD CONSTRAINT fk3vhflqw0lwbwn49xqoivrtugt FOREIGN KEY (role_id) REFERENCES public.roles(id);


--
-- TOC entry 3407 (class 2606 OID 35870)
-- Name: adjustment_details fk44cq3qaq6w2akqveahjv1qq54; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.adjustment_details
    ADD CONSTRAINT fk44cq3qaq6w2akqveahjv1qq54 FOREIGN KEY (product_variant_id) REFERENCES public.product_variants(id);


--
-- TOC entry 3448 (class 2606 OID 36075)
-- Name: quotation_details fk47semmwcknt178jtvifd67pii; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.quotation_details
    ADD CONSTRAINT fk47semmwcknt178jtvifd67pii FOREIGN KEY (product_variant_id) REFERENCES public.product_variants(id);


--
-- TOC entry 3469 (class 2606 OID 36180)
-- Name: sales fk5bgaw8g0rrbqdvafq36g58smk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sales
    ADD CONSTRAINT fk5bgaw8g0rrbqdvafq36g58smk FOREIGN KEY (user_id) REFERENCES public.users(id);


--
-- TOC entry 3412 (class 2606 OID 35895)
-- Name: expenses fk62n5q2inmp5rpeugm0pny5qp1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.expenses
    ADD CONSTRAINT fk62n5q2inmp5rpeugm0pny5qp1 FOREIGN KEY (expense_category_id) REFERENCES public.expense_categories(id);


--
-- TOC entry 3462 (class 2606 OID 36145)
-- Name: sale_return_details fk6cv7g4chqvnbn0d08ken9am8u; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sale_return_details
    ADD CONSTRAINT fk6cv7g4chqvnbn0d08ken9am8u FOREIGN KEY (product_id) REFERENCES public.products(id);


--
-- TOC entry 3423 (class 2606 OID 35950)
-- Name: permission_role fk6mg4g9rc8u87l0yavf8kjut05; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.permission_role
    ADD CONSTRAINT fk6mg4g9rc8u87l0yavf8kjut05 FOREIGN KEY (permission_id) REFERENCES public.permissions(id);


--
-- TOC entry 3459 (class 2606 OID 36130)
-- Name: sale_details fk6nruj5m7ntwhc29etigqnlk0m; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sale_details
    ADD CONSTRAINT fk6nruj5m7ntwhc29etigqnlk0m FOREIGN KEY (sale_id) REFERENCES public.sales(id);


--
-- TOC entry 3480 (class 2606 OID 36235)
-- Name: transfers fk7m5unyo9bjegg5d48k1y94w0w; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.transfers
    ADD CONSTRAINT fk7m5unyo9bjegg5d48k1y94w0w FOREIGN KEY (to_warehouse_id) REFERENCES public.warehouses(id);


--
-- TOC entry 3463 (class 2606 OID 36150)
-- Name: sale_return_details fk7pymn8afwvefhvc4jis003cwe; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sale_return_details
    ADD CONSTRAINT fk7pymn8afwvefhvc4jis003cwe FOREIGN KEY (sale_return_id) REFERENCES public.sale_returns(id);


--
-- TOC entry 3455 (class 2606 OID 36110)
-- Name: role_user fk7tjfd3wunlpu0di6qpu5asgen; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.role_user
    ADD CONSTRAINT fk7tjfd3wunlpu0di6qpu5asgen FOREIGN KEY (role_id) REFERENCES public.roles(id);


--
-- TOC entry 3439 (class 2606 OID 36030)
-- Name: purchase_return_details fk7tta5uxl8ii1e0triierd1lwo; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.purchase_return_details
    ADD CONSTRAINT fk7tta5uxl8ii1e0triierd1lwo FOREIGN KEY (product_id) REFERENCES public.products(id);


--
-- TOC entry 3420 (class 2606 OID 35935)
-- Name: payment_sale_returns fk840y3ilxt1br9j6t7p9yeabw5; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.payment_sale_returns
    ADD CONSTRAINT fk840y3ilxt1br9j6t7p9yeabw5 FOREIGN KEY (user_id) REFERENCES public.users(id);


--
-- TOC entry 3410 (class 2606 OID 35885)
-- Name: adjustments fk8cmjqeon67gbb8xk8ues2v4u; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.adjustments
    ADD CONSTRAINT fk8cmjqeon67gbb8xk8ues2v4u FOREIGN KEY (warehouse_id) REFERENCES public.warehouses(id);


--
-- TOC entry 3427 (class 2606 OID 35970)
-- Name: product_warehouse fk8mm3bmktx4ipfnkk1r72d2qqf; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.product_warehouse
    ADD CONSTRAINT fk8mm3bmktx4ipfnkk1r72d2qqf FOREIGN KEY (product_id) REFERENCES public.products(id);


--
-- TOC entry 3436 (class 2606 OID 36015)
-- Name: purchase_details fk8nalokyn4ap9ebeo5hjjximls; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.purchase_details
    ADD CONSTRAINT fk8nalokyn4ap9ebeo5hjjximls FOREIGN KEY (purchase_id) REFERENCES public.purchases(id);


--
-- TOC entry 3443 (class 2606 OID 36050)
-- Name: purchase_returns fk8yvur48mh0n46de69uaojgbyw; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.purchase_returns
    ADD CONSTRAINT fk8yvur48mh0n46de69uaojgbyw FOREIGN KEY (user_id) REFERENCES public.users(id);


--
-- TOC entry 3418 (class 2606 OID 35925)
-- Name: payment_purchases fk98sehhe1g1i7jla6xt7dhpn34; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.payment_purchases
    ADD CONSTRAINT fk98sehhe1g1i7jla6xt7dhpn34 FOREIGN KEY (user_id) REFERENCES public.users(id);


--
-- TOC entry 3429 (class 2606 OID 35980)
-- Name: products fka3a4mpsfdf4d2y6r8ra3sc8mv; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.products
    ADD CONSTRAINT fka3a4mpsfdf4d2y6r8ra3sc8mv FOREIGN KEY (brand_id) REFERENCES public.brands(id);


--
-- TOC entry 3449 (class 2606 OID 36080)
-- Name: quotation_details fkaqydkynkh434ifin8tw1jehq6; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.quotation_details
    ADD CONSTRAINT fkaqydkynkh434ifin8tw1jehq6 FOREIGN KEY (product_id) REFERENCES public.products(id);


--
-- TOC entry 3428 (class 2606 OID 35975)
-- Name: product_warehouse fkb079c7n0iwp9kyhxg05ilawqa; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.product_warehouse
    ADD CONSTRAINT fkb079c7n0iwp9kyhxg05ilawqa FOREIGN KEY (warehouse_id) REFERENCES public.warehouses(id);


--
-- TOC entry 3437 (class 2606 OID 36020)
-- Name: purchase_details fkb73jher2ahwkm3ufsfbjp8qrl; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.purchase_details
    ADD CONSTRAINT fkb73jher2ahwkm3ufsfbjp8qrl FOREIGN KEY (purchase_unit_id) REFERENCES public.units(id);


--
-- TOC entry 3468 (class 2606 OID 36175)
-- Name: sales fkbbif9cb3ecyusyms54yvwlhd5; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sales
    ADD CONSTRAINT fkbbif9cb3ecyusyms54yvwlhd5 FOREIGN KEY (client_id) REFERENCES public.clients(id);


--
-- TOC entry 3409 (class 2606 OID 35880)
-- Name: adjustments fkblce0mpmgcocmguvnva8ofo1s; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.adjustments
    ADD CONSTRAINT fkblce0mpmgcocmguvnva8ofo1s FOREIGN KEY (user_id) REFERENCES public.users(id);


--
-- TOC entry 3445 (class 2606 OID 36060)
-- Name: purchases fkbn2k5burari3lcgietiifq9ho; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.purchases
    ADD CONSTRAINT fkbn2k5burari3lcgietiifq9ho FOREIGN KEY (provider_id) REFERENCES public.providers(id);


--
-- TOC entry 3460 (class 2606 OID 36135)
-- Name: sale_details fkbsd5fduysox0fquwcasmr88og; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sale_details
    ADD CONSTRAINT fkbsd5fduysox0fquwcasmr88og FOREIGN KEY (sale_unit_id) REFERENCES public.units(id);


--
-- TOC entry 3481 (class 2606 OID 36240)
-- Name: units fkbt2bv4sx8vh6ochwa9vwx5cmd; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.units
    ADD CONSTRAINT fkbt2bv4sx8vh6ochwa9vwx5cmd FOREIGN KEY (base_unit) REFERENCES public.units(id);


--
-- TOC entry 3478 (class 2606 OID 36225)
-- Name: transfers fkcvgnuaekhfu7jkgfdjr2rsy6w; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.transfers
    ADD CONSTRAINT fkcvgnuaekhfu7jkgfdjr2rsy6w FOREIGN KEY (user_id) REFERENCES public.users(id);


--
-- TOC entry 3435 (class 2606 OID 36010)
-- Name: purchase_details fkcxl0u6f0whli7bhn1q8ja0ba3; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.purchase_details
    ADD CONSTRAINT fkcxl0u6f0whli7bhn1q8ja0ba3 FOREIGN KEY (product_id) REFERENCES public.products(id);


--
-- TOC entry 3434 (class 2606 OID 36005)
-- Name: purchase_details fkdardplwswx5axlhgub8gi3dxr; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.purchase_details
    ADD CONSTRAINT fkdardplwswx5axlhgub8gi3dxr FOREIGN KEY (product_variant_id) REFERENCES public.product_variants(id);


--
-- TOC entry 3431 (class 2606 OID 35990)
-- Name: products fkeex0i50vfsa5imebrfdiyhmp9; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.products
    ADD CONSTRAINT fkeex0i50vfsa5imebrfdiyhmp9 FOREIGN KEY (unit_id) REFERENCES public.units(id);


--
-- TOC entry 3421 (class 2606 OID 35940)
-- Name: payment_sales fkfkoaea5b43flsv20nfyagv3u; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.payment_sales
    ADD CONSTRAINT fkfkoaea5b43flsv20nfyagv3u FOREIGN KEY (sale_id) REFERENCES public.sales(id);


--
-- TOC entry 3426 (class 2606 OID 35965)
-- Name: product_warehouse fkflvceifyxftlw7a7kfxkjfw4y; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.product_warehouse
    ADD CONSTRAINT fkflvceifyxftlw7a7kfxkjfw4y FOREIGN KEY (product_variant_id) REFERENCES public.product_variants(id);


--
-- TOC entry 3472 (class 2606 OID 36195)
-- Name: settings fkg4h5v1r2l88vmwpd8e54id19v; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.settings
    ADD CONSTRAINT fkg4h5v1r2l88vmwpd8e54id19v FOREIGN KEY (currency_id) REFERENCES public.currencies(id);


--
-- TOC entry 3422 (class 2606 OID 35945)
-- Name: payment_sales fkgolnmnuuifqd52s0h5q7tpap8; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.payment_sales
    ADD CONSTRAINT fkgolnmnuuifqd52s0h5q7tpap8 FOREIGN KEY (user_id) REFERENCES public.users(id);


--
-- TOC entry 3471 (class 2606 OID 36190)
-- Name: settings fkh0ckbipyrqgc13y4tm55a25xx; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.settings
    ADD CONSTRAINT fkh0ckbipyrqgc13y4tm55a25xx FOREIGN KEY (client_id) REFERENCES public.clients(id);


--
-- TOC entry 3432 (class 2606 OID 35995)
-- Name: products fkh366vywndv4pijim81ul56747; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.products
    ADD CONSTRAINT fkh366vywndv4pijim81ul56747 FOREIGN KEY (unit_purchase_id) REFERENCES public.units(id);


--
-- TOC entry 3470 (class 2606 OID 36185)
-- Name: sales fkhf9hp5u4um5na1qrld83f70l2; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sales
    ADD CONSTRAINT fkhf9hp5u4um5na1qrld83f70l2 FOREIGN KEY (warehouse_id) REFERENCES public.warehouses(id);


--
-- TOC entry 3476 (class 2606 OID 36215)
-- Name: transfer_details fkhk1fvu2o6m083ox9tehqexn60; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.transfer_details
    ADD CONSTRAINT fkhk1fvu2o6m083ox9tehqexn60 FOREIGN KEY (transfer_id) REFERENCES public.transfers(id);


--
-- TOC entry 3413 (class 2606 OID 35900)
-- Name: expenses fkhpk0n2cbnfiuu5nrgl0ika3hq; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.expenses
    ADD CONSTRAINT fkhpk0n2cbnfiuu5nrgl0ika3hq FOREIGN KEY (user_id) REFERENCES public.users(id);


--
-- TOC entry 3456 (class 2606 OID 36115)
-- Name: role_user fkhvai2k29vlwpt9wod4sw4ghmn; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.role_user
    ADD CONSTRAINT fkhvai2k29vlwpt9wod4sw4ghmn FOREIGN KEY (user_id) REFERENCES public.users(id);


--
-- TOC entry 3438 (class 2606 OID 36025)
-- Name: purchase_return_details fki1m8x9qbs31gmgk48lercfh60; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.purchase_return_details
    ADD CONSTRAINT fki1m8x9qbs31gmgk48lercfh60 FOREIGN KEY (product_variant_id) REFERENCES public.product_variants(id);


--
-- TOC entry 3474 (class 2606 OID 36205)
-- Name: transfer_details fki2rtqu7atovkpcfbbdv2qfibg; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.transfer_details
    ADD CONSTRAINT fki2rtqu7atovkpcfbbdv2qfibg FOREIGN KEY (product_variant_id) REFERENCES public.product_variants(id);


--
-- TOC entry 3477 (class 2606 OID 36220)
-- Name: transfer_details fkiamx66lymmqbnjfy7x3hahabh; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.transfer_details
    ADD CONSTRAINT fkiamx66lymmqbnjfy7x3hahabh FOREIGN KEY (purchase_unit_id) REFERENCES public.units(id);


--
-- TOC entry 3444 (class 2606 OID 36055)
-- Name: purchase_returns fkihwyabpeahrl2yv7ivjflrxlj; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.purchase_returns
    ADD CONSTRAINT fkihwyabpeahrl2yv7ivjflrxlj FOREIGN KEY (warehouse_id) REFERENCES public.warehouses(id);


--
-- TOC entry 3479 (class 2606 OID 36230)
-- Name: transfers fkij5isx8s41sjka4vdo2xwvfk0; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.transfers
    ADD CONSTRAINT fkij5isx8s41sjka4vdo2xwvfk0 FOREIGN KEY (from_warehouse_id) REFERENCES public.warehouses(id);


--
-- TOC entry 3453 (class 2606 OID 36100)
-- Name: quotations fkj3s7ongcvjncktb1xnyvrns07; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.quotations
    ADD CONSTRAINT fkj3s7ongcvjncktb1xnyvrns07 FOREIGN KEY (user_id) REFERENCES public.users(id);


--
-- TOC entry 3411 (class 2606 OID 35890)
-- Name: expense_categories fkjbcw6agqb7ya6s33yrxfe4ymp; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.expense_categories
    ADD CONSTRAINT fkjbcw6agqb7ya6s33yrxfe4ymp FOREIGN KEY (user_id) REFERENCES public.users(id);


--
-- TOC entry 3406 (class 2606 OID 35865)
-- Name: adjustment_details fkjmc25dl1ldwc8ejipi7ydy3dk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.adjustment_details
    ADD CONSTRAINT fkjmc25dl1ldwc8ejipi7ydy3dk FOREIGN KEY (adjustment_id) REFERENCES public.adjustments(id);


--
-- TOC entry 3414 (class 2606 OID 35905)
-- Name: expenses fkky2fd53k1f85rdtkpyyimy9li; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.expenses
    ADD CONSTRAINT fkky2fd53k1f85rdtkpyyimy9li FOREIGN KEY (warehouse_id) REFERENCES public.warehouses(id);


--
-- TOC entry 3454 (class 2606 OID 36105)
-- Name: quotations fkl4y8f5ujgi3fs653menqyw0j2; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.quotations
    ADD CONSTRAINT fkl4y8f5ujgi3fs653menqyw0j2 FOREIGN KEY (warehouse_id) REFERENCES public.warehouses(id);


--
-- TOC entry 3461 (class 2606 OID 36140)
-- Name: sale_return_details fklfanga77ry7m7rg0ae6rbs8su; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sale_return_details
    ADD CONSTRAINT fklfanga77ry7m7rg0ae6rbs8su FOREIGN KEY (product_variant_id) REFERENCES public.product_variants(id);


--
-- TOC entry 3465 (class 2606 OID 36160)
-- Name: sale_returns fklxi6530aigpci1gfjnhk7gq6y; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sale_returns
    ADD CONSTRAINT fklxi6530aigpci1gfjnhk7gq6y FOREIGN KEY (client_id) REFERENCES public.clients(id);


--
-- TOC entry 3446 (class 2606 OID 36065)
-- Name: purchases fkm0ndjymn9p747pfp4515pio8i; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.purchases
    ADD CONSTRAINT fkm0ndjymn9p747pfp4515pio8i FOREIGN KEY (user_id) REFERENCES public.users(id);


--
-- TOC entry 3457 (class 2606 OID 36120)
-- Name: sale_details fkmu5mqpa8wg2m2ukufbchdacdm; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sale_details
    ADD CONSTRAINT fkmu5mqpa8wg2m2ukufbchdacdm FOREIGN KEY (product_variant_id) REFERENCES public.product_variants(id);


--
-- TOC entry 3451 (class 2606 OID 36090)
-- Name: quotation_details fkn4iu0kt443iyv8m6s04h5h0md; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.quotation_details
    ADD CONSTRAINT fkn4iu0kt443iyv8m6s04h5h0md FOREIGN KEY (sale_unit_id) REFERENCES public.units(id);


--
-- TOC entry 3452 (class 2606 OID 36095)
-- Name: quotations fkn8qu972xetsfvcj0atbsbxj6t; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.quotations
    ADD CONSTRAINT fkn8qu972xetsfvcj0atbsbxj6t FOREIGN KEY (client_id) REFERENCES public.clients(id);


--
-- TOC entry 3466 (class 2606 OID 36165)
-- Name: sale_returns fko1brvqt2p5v2fq6jk8jd6b3v4; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sale_returns
    ADD CONSTRAINT fko1brvqt2p5v2fq6jk8jd6b3v4 FOREIGN KEY (user_id) REFERENCES public.users(id);


--
-- TOC entry 3447 (class 2606 OID 36070)
-- Name: purchases fko5ayqstf3r4ec39aykkavuscp; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.purchases
    ADD CONSTRAINT fko5ayqstf3r4ec39aykkavuscp FOREIGN KEY (warehouse_id) REFERENCES public.warehouses(id);


--
-- TOC entry 3415 (class 2606 OID 35910)
-- Name: payment_purchase_returns fko70wjwtevap1rvsfraxhbdjnq; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.payment_purchase_returns
    ADD CONSTRAINT fko70wjwtevap1rvsfraxhbdjnq FOREIGN KEY (purchase_return_id) REFERENCES public.purchase_returns(id);


--
-- TOC entry 3430 (class 2606 OID 35985)
-- Name: products fkog2rp4qthbtt2lfyhfo32lsw9; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.products
    ADD CONSTRAINT fkog2rp4qthbtt2lfyhfo32lsw9 FOREIGN KEY (category_id) REFERENCES public.categories(id);


--
-- TOC entry 3450 (class 2606 OID 36085)
-- Name: quotation_details fkolxi2hah5a2praypvlyrxmiov; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.quotation_details
    ADD CONSTRAINT fkolxi2hah5a2praypvlyrxmiov FOREIGN KEY (quotation_id) REFERENCES public.quotations(id);


--
-- TOC entry 3440 (class 2606 OID 36035)
-- Name: purchase_return_details fkom8y1bsv0fojd4bt5kgfhvbw8; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.purchase_return_details
    ADD CONSTRAINT fkom8y1bsv0fojd4bt5kgfhvbw8 FOREIGN KEY (purchase_return_id) REFERENCES public.purchase_returns(id);


--
-- TOC entry 3425 (class 2606 OID 35960)
-- Name: product_variants fkosqitn4s405cynmhb87lkvuau; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.product_variants
    ADD CONSTRAINT fkosqitn4s405cynmhb87lkvuau FOREIGN KEY (product_id) REFERENCES public.products(id);


--
-- TOC entry 3473 (class 2606 OID 36200)
-- Name: settings fkovtcjwa3cwvu1h6ywcmm5uc8v; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.settings
    ADD CONSTRAINT fkovtcjwa3cwvu1h6ywcmm5uc8v FOREIGN KEY (warehouse_id) REFERENCES public.warehouses(id);


--
-- TOC entry 3417 (class 2606 OID 35920)
-- Name: payment_purchases fkpbq8vv1l2uiieragfbuvigddq; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.payment_purchases
    ADD CONSTRAINT fkpbq8vv1l2uiieragfbuvigddq FOREIGN KEY (purchase_id) REFERENCES public.purchases(id);


--
-- TOC entry 3419 (class 2606 OID 35930)
-- Name: payment_sale_returns fkqb0h1qwj9dc6ytrqq0af3ncwm; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.payment_sale_returns
    ADD CONSTRAINT fkqb0h1qwj9dc6ytrqq0af3ncwm FOREIGN KEY (sale_return_id) REFERENCES public.sale_returns(id);


--
-- TOC entry 3475 (class 2606 OID 36210)
-- Name: transfer_details fkqh3r55166n1cn6du14puixl3q; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.transfer_details
    ADD CONSTRAINT fkqh3r55166n1cn6du14puixl3q FOREIGN KEY (product_id) REFERENCES public.products(id);


--
-- TOC entry 3458 (class 2606 OID 36125)
-- Name: sale_details fkqvh82ispfukxa2yssnok0m12o; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sale_details
    ADD CONSTRAINT fkqvh82ispfukxa2yssnok0m12o FOREIGN KEY (product_id) REFERENCES public.products(id);


--
-- TOC entry 3433 (class 2606 OID 36000)
-- Name: products fkr1e7sd726jtaifeam5h2i10pk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.products
    ADD CONSTRAINT fkr1e7sd726jtaifeam5h2i10pk FOREIGN KEY (unit_sale_id) REFERENCES public.units(id);


--
-- TOC entry 3416 (class 2606 OID 35915)
-- Name: payment_purchase_returns fks00nu29ftrlrj88nefke2cxn0; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.payment_purchase_returns
    ADD CONSTRAINT fks00nu29ftrlrj88nefke2cxn0 FOREIGN KEY (user_id) REFERENCES public.users(id);


--
-- TOC entry 3441 (class 2606 OID 36040)
-- Name: purchase_return_details fkslcedf3s0jqjuflg9eonve6q3; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.purchase_return_details
    ADD CONSTRAINT fkslcedf3s0jqjuflg9eonve6q3 FOREIGN KEY (purchase_unit_id) REFERENCES public.units(id);


-- Completed on 2022-04-29 13:50:32

--
-- PostgreSQL database dump complete
--

