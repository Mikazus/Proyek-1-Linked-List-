## 👥 Anggota Kelompok

| No. | Nama | NIM |
|:---:|---|:---:|
| 1 | **Mikhael Lucien Then** | `255150201111036` |
| 2 | **Michael Juanio Patrick** | `255150201111037` |
| 3 | **Almer Firdaus Widjokongko** | `255150201111039` |

# Proyek 1 ASD — Implementasi Linked List

<div align="center">

### Struktur Data Linked List dengan Java

Implementasi **singly linked list** dan **doubly linked list**  
untuk mempelajari cara kerja node, pointer, serta operasi dasar pada struktur data.

</div>

## 📖 Tentang Proyek

Proyek ini merupakan latihan mata kuliah **Algoritma dan Struktur Data (ASD)**
yang membahas implementasi struktur data linked list menggunakan Java.
Data disimpan dalam node yang saling terhubung sehingga penambahan dan
penghapusan elemen dapat dilakukan secara dinamis.

Proyek ini mencakup dua jenis linked list:

- **Singly Linked List** — setiap node menyimpan data dan referensi ke node
  berikutnya.
- **Doubly Linked List** — setiap node menyimpan data serta referensi ke node
  sebelumnya dan berikutnya.

## ✨ Fitur

Antarmuka `LinkedList` menyediakan operasi dasar berikut:

- Menambahkan data di awal atau akhir list (`addFirst`, `addLast`)
- Menambahkan data setelah indeks tertentu (`addAfter`)
- Menghapus data pertama atau terakhir (`deleteFirst`, `deleteLast`)
- Menghapus data setelah indeks tertentu (`deleteAfter`)
- Mengambil data berdasarkan indeks (`get`)
- Mencari indeks data (`indexOf`)
- Menghapus data tertentu (`remove`)
- Menampilkan isi list dari belakang (`printReverse`)
- Mengubah isi list menjadi array (`toArray`)
- Memeriksa kondisi kosong dan ukuran list (`isEmpty`, `size`)

## 🗂️ Struktur Berkas

```text
.
├── LinkedList.java             # Interface operasi linked list
├── Node.java                   # Node untuk singly linked list
├── Node2P.java                 # Node dengan pointer next dan prev
├── SinglyLinkedList.java       # Implementasi singly linked list
├── DoublyLinkedList.java       # Implementasi doubly linked list
├── testNode.java               # Pengujian node
├── testSinglyLinkedList.java   # Pengujian singly linked list
├── testDoublyLinkedList.java   # Pengujian doubly linked list
└── Kelompok.md                 # Informasi kelompok
```

## 🚀 Cara Menjalankan

Pastikan **Java Development Kit (JDK)** telah terpasang, kemudian buka
terminal pada folder proyek.

### 1. Compile seluruh berkas Java

```bash
javac *.java
```

### 2. Jalankan program uji

```bash
java testSinglyLinkedList
java testDoublyLinkedList
java testNode
```

## 🧠 Konsep yang Dipelajari

Melalui proyek ini, konsep yang dipraktikkan meliputi:

- Representasi data menggunakan node
- Penggunaan referensi antarnode
- Perbedaan singly linked list dan doubly linked list
- Traversal dari head ke tail maupun sebaliknya
- Penanganan list kosong dan indeks data
- Pengelolaan ukuran list secara dinamis

---

<div align="center">

**Proyek 1 ASD • Java • Linked List**

</div>