package com.datastruct;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int V = 281;  
        Graph g = new Graph(281);
        
        g.addEdge(0, 1, 17441); // Titik Evakuasi 1 - LAB. TTL
        g.addEdge(1, 2, 480); // LAB. TTL - LAB. CAD-CAM
        g.addEdge(0, 3, 17921); // Titik Evakuasi 1 - LAB. Fisika
        g.addEdge(2, 4, 1080); // LAB. CAD-CAM - Tangga Darurat 2 L Lt. 1
        g.addEdge(4, 5, 840); // Tangga Darurat 2 L Lt. 1 - Toilet L Lantai 1
        g.addEdge(5, 6, 890); // Toilet L Lantai 1 - LAB. CNC
        g.addEdge(3, 7, 3210); // LAB. Fisika - LAB. Mekatronika 1
        g.addEdge(7, 8, 900); // LAB. Mekatronika 1 - LAB. Mekatronika 2
        g.addEdge(6, 9, 1920); // LAB. CNC - LAB. Proses Produksi
        g.addEdge(8, 10, 1680); // - LAB. Prestasi Mesin    
        g.addEdge(9, 11, 2160); // LAB. Proses Produksi - Tangga Darurat 1 L Lt. 1


         // - Lantai 1 - Gedung K (Kanan ke Kiri)
        g.addEdge(10, 12, 690); // LAB. Prestasi Mesin - Tarumanagara Human Cell Technology LAB.
        g.addEdge(11, 13, 450); // Tangga Darurat 1 L Lt. 1 - Toilet Perempuan K Lt. 1
        g.addEdge(13, 14, 920); // Toilet Perempuan K Lt. 1 - Toilet Laki-Laki K Lt. 1
        g.addEdge(14, 15, 660); // Toilet Laki-Laki K Lt.1 - Dr. Widodo Kushartomo
        g.addEdge(12, 16, 2280); // Tarumanagara Human Cell Technology LAB. - LAB. Geologi Dan Mekanika Tanah
        g.addEdge(15, 17, 240); // Dr. Widodo Kushartomo - LAB. Kontruksi Dan Teknologi Beton
        g.addEdge(16, 18, 2280); // LAB. Geologi Dan Mekanika Tanah - Tangga Darurat 1 K Lt. 1
        g.addEdge(18, 19, 880); // Tangga Darurat 1 K Lt. 1 - Gudang K Lt. 1

        // - Lantai 1 - Gedung R (Kanan ke Kiri)
        g.addEdge(19, 20, 14270); // Gudang K Lt. 1 - Ruang Pompa K-R
        g.addEdge(17, 20, 16610); // LAB. Kontruksi Dan Teknologi Beton - Ruang Pompa K-R
        g.addEdge(20, 21, 16290); // Ruang Pompa K-R - Aula Gedung R
        g.addEdge(21, 22, 10000); // Aula Gedung R - Tangga Darurat 1 R Lt.1
        g.addEdge(22, 23, 515); // Tangga Darurat 1 R Lt.1 - Toilet R Lt. 1
        g.addEdge(23, 24, 1415); // Toilet R Lt. 1 - LAB. Dinamika Fluida
        g.addEdge(22, 25, 2380); // Tangga Darurat 1 R Lt.1 - LAB. Jalan Raya dan Transportasi
        g.addEdge(25, 26, 2065); // LAB. Jalan Raya dan Transportasi - Tangga Darurat 1 R Lt. 1
        g.addEdge(24, 26, 2370); // LAB. Dinamika Fluida - Tangga Darurat 1 R Lt. 1

        
        // - Lantai 2 - Gedung L (Kanan ke Kiri)
        g.addEdge(27, 28, 440); // Perpustakaan Teknik - Tangga Darurat 2 L Lt.2
        g.addEdge(4, 28, 920); // Tangga Darurat 2 L Lt.1 - Tangga Darurat 2 L Lt.2 -----> (1) Tangga Darurat 2 L Lt. 1 Ke Lt.2
        g.addEdge(28, 29, 780); // Tangga Darurat 2 L Lt.2 - Toilet L Lantai 2
        g.addEdge(29, 30, 2000); // Toilet L Lantai 2 - Tarumanagara Psychology Center
        g.addEdge(27, 31, 3020); // Perpustakaan Teknik - Perpustakaan Ilmu Psikologi
        g.addEdge(31, 32, 1640); // Perpustakaan Ilmu Psikologi - LAB. Observasi
        g.addEdge(32, 33, 200); // LAB. Observasi - Gudang L Lt. 2
        g.addEdge(30, 34, 1800); // Tarumanagara Psychology Center - Tangga Darurat 1 L Lt. 2
        g.addEdge(11, 34, 920); // Tangga Darurat 1 L Lt. 1 - Tangga Darurat 1 L Lt. 2 -----> (2) Tangga Darurat 1 L Lt. 1 Ke Lt. 2
        
        // - Lantai 2 - Gedung K (Kanan ke Kiri)
        g.addEdge(34, 35, 450); // Tangga Darurat 1 L Lt. 2 - Toilet Perempuan K Lt. 4
        g.addEdge(35, 36, 920); // Toilet Perempuan K Lt. 4 - Toilet Laki-Laki K Lt. 4
        g.addEdge(36, 37, 1240); // Toilet Laki-Laki K Lt. 4 - K. 301
        g.addEdge(33, 38, 4240); // Gudang L Lt. 2 - Sekretariat Psikologi
        g.addEdge(38, 39, 560); // Sekretariat Psikologi - Tangga Darurat 1 K Lt. 2
        g.addEdge(18, 39, 920); // Tangga Darurat 1 K Lt. 1 - Tangga Darurat 1 K Lt. 2 -----> (3) Tangga Darurat 1 K Lt. 1 Ke Lt. 2
        g.addEdge(39, 40, 480); // Tangga Darurat 1 K Lt. 2 - Ruang Sidang Skripsi K Lt. 2
        g.addEdge(37, 41, 3520); // K. 301 - Ruang Dosen Psikologi

        // - Lantai 2 - Gedung R (Kanan ke Kiri)
        g.addEdge(22, 42, 1057); // Tangga Darurat 1 R Lt.1 - Tangga Darurat 1 R Lt. 2 -----> (4) Tangga Darurat 1 R Lt. 1 Ke Lt. 2
        g.addEdge(42, 43, 515); // Tangga Darurat 1 R Lt. 2 - Toilet R Lt. 2
        g.addEdge(43, 44, 815); // Toilet R Lt. 2 - R2. 02
        g.addEdge(42, 45, 1780); // Tangga Darurat 1 R Lt. 2 - R2. 01
        g.addEdge(44, 46, 175); // R2. 02 - R2. 04
        g.addEdge(45, 47, 600); // R2. 01 - LAB. Bermain Anak
        g.addEdge(47, 48, 175); // LAB. Bermain Anak - LAB. Neuropsikologi
        g.addEdge(48, 49, 1175); // LAB. Neuropsikologi - LAB. Psikologi Kreativitas
        g.addEdge(49, 50, 715); // LAB. Psikologi Kreativitas - Tangga Darurat 2 R Lt. 2
        g.addEdge(46, 50, 2975); // R2. 04 - Tangga Darurat 2 R Lt. 2
        g.addEdge(26, 50, 1020); // Tangga Darurat 1 R Lt. 1 - Tangga Darurat 2 R Lt. 2 -----> (5) Tangga Darurat 2 R Lt. 1 Ke Lt. 2

        // - Lantai 3 - Gedung L (Kanan ke Kiri)
        g.addEdge(51, 52, 600); // Academic Hub L Lt. 3 - Tangga Darurat 2 L Lt. 3
        g.addEdge(28, 52, 920); // Tangga Darurat 2 L Lt.2 - Tangga Darurat 2 L Lt. 3 -----> (1) Tangga Darurat 2 L Lt. 2 Ke Lt. 3
        g.addEdge(52, 53, 780); // Tangga Darurat 2 L Lt. 3 - Toilet L Lantai 3
        g.addEdge(53, 54, 1260); // Toilet L Lantai 3 - LAB. Implementasi & Elektronika Cerdas
        g.addEdge(51, 55, 2250); // Academic Hub L Lt. 3 - Sekretariat L Lt. 3
        g.addEdge(55, 56, 450); // Sekretariat L Lt. 3 - LAB. Instrumentasi & Pengukuran
        g.addEdge(54, 57, 1230); // LAB. Implementasi & Elektronika Cerdas - LAB. Inovasi SIstem Otomasi & Ros
        g.addEdge(57, 58, 660); // LAB. Inovasi SIstem Otomasi & Ros - LAB. Fenomena Mesin
        g.addEdge(56, 59, 2040); // LAB. Instrumentasi & Pengukuran - LAB. Hidrolik & Pneumatik
        g.addEdge(58, 60, 930); // LAB. Fenomena Mesin - LAB. Metalurgi Fisik
        g.addEdge(60, 61, 870); // LAB. Metalurgi Fisik - Tangga Darurat 1 L Lt. 3
        g.addEdge(60, 61, 870); // Tangga Darurat 1 L Lt. 2 - Tangga Darurat 1 L Lt. 3 -----> (2) Tangga Darurat 1 L Lt. 2 Ke Lt. 3

         // - Lantai 3 - Gedung K (Kanan ke Kiri)
        g.addEdge(59, 62, 840); // LAB. Hidrolik & Pneumatik - Ruang Kelas K Lt. 4
        g.addEdge(61, 63, 450); // Tangga Darurat 1 L Lt. 3 - Toilet Perempuan K Lt. 4
        g.addEdge(63, 64, 920); // Toilet Perempuan K Lt. 4 - Toilet Laki-Laki K Lt. 4
        g.addEdge(64, 65, 1240); // Toilet Laki-Laki K Lt. 4 - K. 301
        g.addEdge(62, 66, 1760); // Ruang Kelas K Lt. 4 - K. 302
        g.addEdge(65, 67, 400); // K. 301 - K. 303
        g.addEdge(66, 68, 400); // K. 302 - K. 304
        g.addEdge(67, 69, 1160); // K. 303 - Ruang Penyimpanan ATK K Lt.3
        g.addEdge(68, 70, 1160); // K. 304 - Ruang Sekretariat Gedung K Lt. 3
        g.addEdge(70, 71, 560); // Ruang Sekretariat Gedung K Lt. 3 - Tangga Darurat 1 K Lt. 3
        g.addEdge(39, 70, 560); // Tangga Darurat 1 K Lt. 2 - Tangga Darurat 1 K Lt. 3 -----> (3) Tangga Darurat 1 K Lt. 2 Ke Lt. 3
        g.addEdge(69, 72, 560); // Ruang Penyimpanan ATK K Lt.3 - K. 305
        g.addEdge(70, 73, 560); // Ruang Sekretariat Gedung K Lt. 3 - SMART CLASSROOM
        g.addEdge(72, 74, 440); // K. 305 - K. 307

         // - Lantai 3 - Gedung R (Kanan ke Kiri)
        g.addEdge(73, 75, 1920); // SMART CLASSROOM - Studio Bahan Interior R Lt. 3
        g.addEdge(74, 75, 1880); // K. 307 - Studio Bahan Interior R Lt. 3
        g.addEdge(75, 76, 1800); // Studio Bahan Interior R Lt. 3 - Sekretariat Program Studi Magister Psikologi
        g.addEdge(76, 77, 230); // Sekretariat Program Studi Magister Psikologi - Tangga Darurat 1 R Lt. 3
        g.addEdge(42, 77, 1057); // Tangga Darurat 1 R Lt. 2 - Tangga Darurat 1 R Lt. 3 -----> (4) Tangga Darurat 1 R Lt. 2 Ke Lt. 3
        g.addEdge(77, 78, 515); // Tangga Darurat 1 R Lt. 3 - Toilet R Lt. 3
        g.addEdge(78, 79, 1345); // Toilet R Lt. 3 - Ruang Konseling 1
        g.addEdge(79, 80, 120); // Ruang Konseling 1 - Ruang Konseling 2
        g.addEdge(75, 81, 1780); // Studio Bahan Interior R Lt. 3 - R3. 01
        g.addEdge(80, 82, 180); // Ruang Konseling 2 - Ruang Diskusi 2
        g.addEdge(82, 83, 120); // Ruang Diskusi 2 - Ruang Diskusi 1
        g.addEdge(83, 84, 1190); // Ruang Diskusi 1 - Ruang Dosen Tidak Tetap
        g.addEdge(81, 85, 775); // R3. 01 - R3. 03
        g.addEdge(84, 86, 1290); // Ruang Dosen Tidak Tetap - Mushola  R Lt. 4
        g.addEdge(85, 88, 1175); // R3. 03 - R3. 05
        g.addEdge(86, 87, 1865); // Mushola  R Lt. 4 - LAB. Konseling Psikologi
        g.addEdge(88, 89, 715); // R3. 05 - Tangga Darurat 2 R Lt. 3
        g.addEdge(87, 89, 1020); // LAB. Konseling Psikologi - Tangga Darurat 2 R Lt. 3
        g.addEdge(50, 89, 1020); // Tangga Darurat 2 R Lt. 2 - Tangga Darurat 2 R Lt. 3 -----> (5) Tangga Darurat 2 R Lt. 2 Ke Lt. 3

        g.addEdge(90, 91, 600); // Academic Hub L Lt. 4 - Tangga Darurat 2 L Lt. 4
        g.addEdge(52, 91, 600); // Tangga Darurat 2 L Lt. 3 - Tangga Darurat 2 L Lt. 4 -----> (1) Tangga Darurat 2 L Lt. 3 Ke Lt. 4
        g.addEdge(91, 92, 780); // Tangga Darurat 2 L Lt. 4 - Toilet L Lantai 4
        g.addEdge(90, 93, 1020); // Academic Hub L Lt. 4 - Ruang Dosen L Lt. 4
        g.addEdge(92, 94, 1080); // Toilet L Lantai 4 - L. 405
        g.addEdge(93, 95, 1080); // Ruang Dosen L Lt. 4 - L. 408
        g.addEdge(94, 96, 930); // L. 405 - L. 407
        g.addEdge(96, 97, 480); // L. 407 - Ruang Gudang L Lt. 4
        g.addEdge(97, 98, 960); // Ruang Gudang L Lt. 4 - L. 409
        g.addEdge(96, 99, 1710); // L. 408 - Studio Audio Visual
        g.addEdge(98, 100, 600); // L. 409 - L. 411
        g.addEdge(100, 101, 870); // L. 411 - Tangga Darurat 1 L Lt. 4
        g.addEdge(61, 101, 920); // Tangga Darurat 1 L Lt. 3 - Tangga Darurat 1 L Lt. 4 -----> (2) Tangga Darurat 1 L Lt. 3 Ke Lt. 4

         // - Lantai 4 - Gedung K (Kanan ke Kiri)
        g.addEdge(101, 102, 450); // Tangga Darurat 1 L Lt. 4 - Toilet Perempuan K Lt. 4
        g.addEdge(102, 103, 920); // Toilet Perempuan K Lt. 4 - Toilet Laki-Laki K Lt. 4
        g.addEdge(103, 104, 1240); // Toilet Laki-Laki K Lt. 4 - Mushola Pantry Arsip
        g.addEdge(104, 105, 640); // Mushola Pantry Arsip - Ruang Rapat
        g.addEdge(99, 106, 3230); // Studio Audio Visual - Sekretariat FSRD
        g.addEdge(105, 107, 440); // Ruang Rapat - Ruang Penyimpanan ATK K Lt. 4
        g.addEdge(107, 108, 1040); // Ruang Penyimpanan ATK K Lt. 4 - Studio FOTOGRAFI
        g.addEdge(106, 109, 2040); // Sekretariat FSRD - Tangga Darurat 1 K Lt. 4
        g.addEdge(71, 109, 400); // Tangga Darurat 1 K Lt. 3 - Tangga Darurat 1 K Lt. 4 -----> (3) Tangga Darurat 1 K Lt. 3 Ke Lt. 4
        g.addEdge(109, 110, 400); // Tangga Darurat 1 K Lt. 4 - Ruang Seminar K Lt. 4

        // - Lantai 4 - Gedung R (Kanan ke Kiri)
        g.addEdge(110, 111, 2240); // Ruang Seminar K Lt. 4 - Studio Bahan Interior K Lt. 4
        g.addEdge(108, 111, 2480); // Studio FOTOGRAFI - Studio Bahan Interior K Lt. 4
        g.addEdge(111, 112, 1800); // Studio Bahan Interior K Lt. 4 - Loket Pelayanan Program Studi DKV
        g.addEdge(112, 113, 230); // Loket Pelayanan Program Studi DKV - Tangga Darurat 1 R Lt. 4
        g.addEdge(77, 113, 1057); // Tangga Darurat 1 R Lt. 3 - Tangga Darurat 1 R Lt. 4 -----> (4) Tangga Darurat 1 R Lt. 3 Ke Lt. 4
        g.addEdge(113, 114, 515); // Tangga Darurat 1 R Lt. 4 - Toilet R Lt. 4
        g.addEdge(114, 115, 815); // Toilet R Lt. 4 - R4. 02
        g.addEdge(113, 116, 1780); // Tangga Darurat 1 R Lt. 4 - R4. 01
        g.addEdge(115, 117, 775); // R4. 02 - R4. 04
        g.addEdge(116, 118, 1950); // R4. 01 - R4. 03
        g.addEdge(118, 119, 715); // R4. 03 - Tangga Darurat 2 R Lt. 4
        g.addEdge(117, 119, 2195); // R4. 04 - Tangga Darurat 2 R Lt. 4
        g.addEdge(89, 119, 1020); // Tangga Darurat 2 R Lt. 3 - Tangga Darurat 2 R Lt. 4 -----> (5) Tangga Darurat 2 R Lt. 3 Ke Lt. 4

        // - Lantai 5 - Gedung L (Kanan ke Kiri)
        g.addEdge(120, 121, 600); // Sekretariat Teknik Sipil - Tangga Darurat 2 L Lt. 5
        g.addEdge(91, 121, 920); // Tangga Darurat 2 L Lt. 4 - Tangga Darurat 2 L Lt. 5 -----> (1) Tangga Darurat 2 L Lt. 4 Ke Lt. 5
        g.addEdge(121, 122, 780); // Tangga Darurat 2 L Lt. 5 - Toilet L Lantai 5
        g.addEdge(120, 123, 1020); // Sekretariat Teknik Sipil - Gudang L Lt. 5
        g.addEdge(122, 124, 960); // Toilet L Lantai 5 - L. 509
        g.addEdge(123, 125, 480); // Gudang L Lt. 5 - Ruang Dosen L Lt. 5
        g.addEdge(124, 126, 960); // L. 509 - L. 511
        g.addEdge(125, 127, 1680); // Ruang Dosen L Lt. 5 - L. 514
        g.addEdge(127, 129, 480); // L. 514 - L. 516
        g.addEdge(126, 128, 1980); // L. 511 - L. 513
        g.addEdge(128, 130, 240); // L. 513 - Ruang Dosen Teknik Sipil L Lt. 5
        g.addEdge(129, 131, 1380); // L. 516 - Ruang Seminar L Lt. 5
        g.addEdge(130, 132, 1200); // Ruang Dosen Teknik Sipil L Lt. 5 - Ruang Studio Komputasi
        g.addEdge(132, 133, 1440); // Ruang Studio Komputasi - Tangga Darurat 1 L Lt. 5
        g.addEdge(101, 133, 920); // Tangga Darurat 1 L Lt. 4 - Tangga Darurat 1 L Lt. 5 -----> (2) Tangga Darurat 1 L Lt. 4 Ke Lt. 5

        
        // - Lantai 5 - Gedung K (Kanan ke Kiri)
        g.addEdge(133, 134, 450); // Tangga Darurat 1 L Lt. 5 - Toilet Perempuan K Lt. 5
        g.addEdge(134, 135, 920); // Toilet Perempuan K Lt. 5 - Toilet Laki-Laki K Lt. 5
        g.addEdge(131, 136, 3650); // Ruang Seminar L Lt. 5 - K. 504
        g.addEdge(135, 137, 1750); // Toilet Laki-Laki K Lt. 5 - Studio Animasi
        g.addEdge(136, 138, 2000); // K. 504 - Tangga Darurat 1 K Lt. 5
        g.addEdge(137, 139, 1480); // Studio Animasi - Studio Komputer Grafis & Design Interior
        g.addEdge(109, 138, 920); // Tangga Darurat 1 K Lt. 4 - Tangga Darurat 1 K Lt. 5 -----> (3) Tangga Darurat 1 K Lt. 4 Ke Lt. 5
        g.addEdge(138, 140, 480); // Tangga Darurat 1 K Lt. 5 - K. 506

        // - Lantai 5 - Gedung R (Kanan ke Kiri)
        g.addEdge(140, 141, 2240); // K. 506 - LAB. Iluminasi & Acoustic
        g.addEdge(139, 141, 2320); // Studio Komputer Grafis & Design Interior - LAB. Iluminasi & Acoustic
        g.addEdge(141, 142, 1800); // LAB. Iluminasi & Acoustic - Epic Design Space FSRD 
        g.addEdge(142, 143, 230) ; // Epic Design Space FSRD - Tangga Darurat 1 R Lt. 5
        g.addEdge(113, 143, 1057); // Tangga Darurat 1 R Lt. 4 - Tangga Darurat 1 R Lt. 5 -----> (4) Tangga Darurat 1 R Lt. 4 Ke Lt. 5
        g.addEdge(143, 144, 515); // Tangga Darurat 1 R Lt. 5 - Toilet R Lt. 5
        g.addEdge(144, 145, 815); // Toilet R Lt. 5 - R5. 02
        g.addEdge(143, 146, 1780); // Tangga Darurat 1 R Lt. 5 - R5. 01
        g.addEdge(145, 147, 775); // R5. 02 - R5. 04
        g.addEdge(146, 148, 1950); // R5. 01 - R5. 03
        g.addEdge(147, 149, 1950); // R5. 04 - Tangga Darurat 2 R Lt. 5
        g.addEdge(148, 149, 715); // R5. 03 - Tangga Darurat 2 R Lt. 5
        g.addEdge(119, 149, 715); // Tangga Darurat 2 R Lt. 4 - Tangga Darurat 2 R Lt. 5 -----> (5) Tangga Darurat 2 R Lt. 4 Ke Lt. 5

        // - Lantai 6 - Gedung L (Kanan ke Kiri)
        g.addEdge(150, 151, 600); // Sekretariat Teknik Mesin & Industri - Tangga Darurat 2 L Lt. 6
        g.addEdge(121, 151, 920); // Tangga Darurat 2 L Lt. 5 - Tangga Darurat 2 L Lt. 6 -----> (1) Tangga Darurat 2 L Lt. 5 Ke Lt. 6
        g.addEdge(151, 152, 780); // Tangga Darurat 2 L Lt. 6 - Toilet L Lantai 6
        g.addEdge(150, 153, 900); // Sekretariat Teknik Mesin & Industri - L. 610
        g.addEdge(153, 154, 240); // L. 610 - LAB. Sistem Produksi
        g.addEdge(152, 155, 360); // Toilet L Lantai 6 - L. 609
        g.addEdge(155, 156, 960); // L. 609 - L. 611
        g.addEdge(154, 157, 1260); // LAB. Sistem Produksi - LAB. Perancangan Sistem Kerja & Ergonomi
        g.addEdge(156, 158, 960); // L. 611 - L. 613
        g.addEdge(157, 159, 900); // LAB. Perancangan Sistem Kerja & Ergonomi - LAB. Rekayasa Kualitas
        g.addEdge(158, 160, 960); // L. 613 - L. 615
        g.addEdge(160, 161, 480); // L. 615 - L. 617
        g.addEdge(159, 162, 1920); // LAB. Rekayasa Kualitas - LAB. Ilmu Ukur Tanah
        g.addEdge(161, 163, 1440); // L. 617 - Tangga Darurat 1 L Lt. 6
        g.addEdge(133, 163, 1440); // Tangga Darurat 1 L Lt. 5 - Tangga Darurat 1 L Lt. 6 -----> (2) Tangga Darurat 1 L Lt. 5 Ke Lt. 6

        // - Lantai 6 - Gedung K (Kanan ke Kiri)
        g.addEdge(162, 165, 1200); // LAB. Ilmu Ukur Tanah - Laboratorium Statika
        g.addEdge(163, 164, 450); // Tangga Darurat 1 L Lt. 6 - Toilet Perempuan K Lt. 6
        g.addEdge(164, 166, 920); // Toilet Perempuan K Lt. 6 - Toilet Laki-Laki K Lt. 6
        g.addEdge(165, 168, 1760); // Laboratorium Statika - K. 602
        g.addEdge(166, 167, 1240); // Toilet Laki-Laki K Lt. 6 - K. 601
        g.addEdge(167, 169, 1560); // K. 601 - K. 603
        g.addEdge(168, 170, 1560); // K. 602 - K. 604
        g.addEdge(170, 171, 560); // K. 604 - Tangga Darurat 1 K Lt. 6
        g.addEdge(138, 171, 920); // Tangga Darurat 1 K Lt. 5 - Tangga Darurat 1 K Lt. 6 -----> (3) Tangga Darurat 1 K Lt. 5 Ke Lt. 6
        g.addEdge(169, 172, 1480); // K. 603 - K. 605
        g.addEdge(171, 173, 480); // Tangga Darurat 1 K Lt. 6 - K. 606

        // - Lantai 6 - Gedung R (Kanan ke Kiri)
        g.addEdge(172, 174, 2320); // K. 605 - Sekretariat DKV
        g.addEdge(173, 174, 2240); // K. 606 - Sekretariat DKV
        g.addEdge(174, 175, 1800); // Sekretariat DKV - Ruang Ilustasi Lt. 6
        g.addEdge(175, 176, 230); // Ruang Ilustasi Lt. 6 - Tangga Darurat 1 R Lt. 6
        g.addEdge(143, 176, 1057); // Tangga Darurat 1 R Lt. 5 - Tangga Darurat 1 R Lt. 6 -----> (4) Tangga Darurat 1 R Lt. 5 Ke Lt. 6
        g.addEdge(176, 177, 515); // Tangga Darurat 1 R Lt. 6 - Toilet R Lt. 6
        g.addEdge(176, 178, 1780); // Tangga Darurat 1 R Lt. 6 - R6. 01
        g.addEdge(177, 179, 815); // Toilet R Lt. 6 - R6. 02
        g.addEdge(179, 180, 775); // R6. 02 - R6. 04
        g.addEdge(178, 181, 1950); // R6. 01 - R6. 03
        g.addEdge(181, 182, 715); // R6. 03 - Tangga Darurat 2 R  Lt. 6
        g.addEdge(180, 182, 2195); // R6. 04 - Tangga Darurat 2 R  Lt. 6
        g.addEdge(149, 182, 1020); // Tangga Darurat 2 R  Lt. 5 - Tangga Darurat 2 R  Lt. 6 -----> (5) Tangga Darurat 2 R Lt. 5 Ke Lt. 6

        // - Lantai 7 - Gedung L (Kanan ke Kiri)
        g.addEdge(183, 184, 600); // Sekretariat Jurusan Arsitektur & Perencanaan - Tangga Darurat 2 L Lt. 7
        g.addEdge(151, 184, 920); // Tangga Darurat 2 L Lt. 6 - Tangga Darurat 2 L Lt. 7 -----> (1) Tangga Darurat 2 L Lt. 6 Ke Lt. 7
        g.addEdge(184, 185, 780) ; // Tangga Darurat 2 L Lt. 7 - Toilet L Lantai 7
        g.addEdge(183, 187, 1140); // Sekretariat Jurusan Arsitektur & Perencanaan - L. 704
        g.addEdge(185, 186, 600); // Toilet L Lantai 7 - L. 701
        g.addEdge(186, 188, 1140); // L. 701 - L. 702
        g.addEdge(187, 189, 1140); // L. 704 - L. 705
        g.addEdge(189, 190, 1020); // L. 705 - L. 706
        g.addEdge(190, 191, 900); // L. 706 - L. 707
        g.addEdge(188, 192, 2160); // L. 702 - L. 703
        g.addEdge(192, 193, 900); // L. 703 - Tangga Darurat 1 L Lt. 7
        g.addEdge(163, 193, 920); // Tangga Darurat 1 L Lt. 6 - Tangga Darurat 1 L Lt. 7 -----> (2) Tangga Darurat 1 L Lt. 5 Ke Lt. 6

        // - Lantai 7 - Gedung K (Kanan ke Kiri)
        g.addEdge(193, 194, 450); // Tangga Darurat 1 L Lt. 7 - Toilet Perempuan K Lt. 7
        g.addEdge(191, 195, 1970); // L. 707 - K. 706
        g.addEdge(194, 196, 920); // Toilet Perempuan K Lt. 7 - Toilet Laki-Laki K Lt. 
        g.addEdge(195, 198, 1760); // K. 706 - K. 701
        g.addEdge(196, 197, 1240); // Toilet Laki-Laki K Lt. 7 - K. 702
        g.addEdge(198, 199, 1560); // K. 701 - Gudang K Lt. 7
        g.addEdge(199, 200, 560); // Gudang K Lt. 7 - Tangga Darurat 1 K Lt. 7
        g.addEdge(171, 200, 920); // Tangga Darurat 1 K Lt. 6 - Tangga Darurat 1 K Lt. 7 -----> (3) Tangga Darurat 1 K Lt. 6 Ke Lt. 7
        g.addEdge(197, 201, 3040); // K. 702 - K. 707
        g.addEdge(200, 202, 480); // Tangga Darurat 1 K Lt. 7 - K. 705

        // - Lantai 7 - Gedung R (Kanan ke Kiri)
        g.addEdge(202, 203, 2240); // K. 705 - Gudang 2 R Lt. 7
        g.addEdge(201, 203, 2320); // K. 707 - Gudang 2 R Lt. 7
        g.addEdge(203, 204, 330); // Gudang 2 R Lt. 7 - Gudang 1 R Lt. 7
        g.addEdge(204, 205, 1470); // Gudang 1 R Lt. 7 - Ruang Oranisasi FTI
        g.addEdge(205, 206, 230); // Ruang Oranisasi FTI - Tangga Darurat 1 R Lt. 7
        g.addEdge(182, 206, 1057); // Tangga Darurat 1 R Lt. 6 - Tangga Darurat 1 R Lt. 7 -----> (4) Tangga Darurat 1 R Lt. 6 Ke Lt. 7
        g.addEdge(206, 207, 515); // Tangga Darurat 1 R Lt. 7 - Toilet R Lt. 7
        g.addEdge(207, 209, 815); // Toilet R Lt. 7 - R7. 02
        g.addEdge(206, 208, 1780); // Tangga Darurat 1 R Lt. 7 - R7. 01
        g.addEdge(209, 210, 775); // R7. 02 - R7. 04
        g.addEdge(208, 211, 1950); // R7. 01 - R7. 05
        g.addEdge(210, 212, 1175); // R7. 04 - R7. 06
        g.addEdge(211, 213, 715); // R7. 05 - Tangga Darurat 2 R Lt. 7
        g.addEdge(212, 213, 1020); // R7. 06 - Tangga Darurat 2 R Lt. 7
        g.addEdge(182, 213, 1020); // Tangga Darurat 2 R Lt. 6 - Tangga Darurat 2 R Lt. 7 -----> (5) Tangga Darurat 2 R Lt. 6 Ke Lt. 7

        // - Lantai 8 - Gedung L (Kanan ke Kiri)
        g.addEdge(214, 215, 600); // Ruang TGA - Tangga Darurat 2 L Lt. 8
        g.addEdge(184, 215, 920); // Tangga Darurat 2 L Lt. 7 - Tangga Darurat 2 L Lt. 8 -----> (1) Tangga Darurat 2 L Lt. 7 Ke Lt. 8
        g.addEdge(214, 216, 000); // Ruang TGA - L. Ruang Fisika Bangunan
        g.addEdge(215, 217, 780); // Tangga Darurat 2 L Lt. 8 - Toilet L Lantai 8
        g.addEdge(217, 218, 1440); // Toilet L Lantai 8 - L. 801
        g.addEdge(216, 219, 1800); // L. Ruang Fisika Bangunan - L. 804
        g.addEdge(218, 220, 1310); // L. 801 - L. 802
        g.addEdge(219, 221, 1200); // L. 804 - L. 805
        g.addEdge(220, 222, 1200); // L. 802 - L. 803
        g.addEdge(221, 223, 1310); // L. 805 - L. 806
        g.addEdge(222, 224, 900); // L. 803 - Tangga Darurat 1 L Lt. 8
        g.addEdge(193, 224, 920); // Tangga Darurat 1 L Lt. 7 - Tangga Darurat 1 L Lt. 8 -----> (2) Tangga Darurat 1 L Lt. 7 Ke Lt. 8

        // - Lantai 8 - Gedung K (Kanan ke Kiri)
        g.addEdge(224, 225, 450); // Tangga Darurat 1 L Lt. 8 - Toilet Perempuan K Lt. 8
        g.addEdge(225, 226, 920); // Toilet Perempuan K Lt. 8 - Toilet Laki-Laki K Lt. 8 
        g.addEdge(226, 227, 1240); // Toilet Laki-Laki K Lt. 8  - Studio Arsitektur
        
        // - Lantai 8 - Gedung R (Kanan ke Kiri)
        g.addEdge(228, 229, 695); // Studio Tugas Akhir Lt. 8 R - Gudang DKV R Lt.  8
        g.addEdge(229, 230, 230); // Gudang DKV R Lt.  8 - Tangga Darurat 1 R Lt. 8
        g.addEdge(260, 230, 1057); // Tangga Darurat 1 R Lt. 7 - Tangga Darurat 1 R Lt. 8 -----> (4) Tangga Darurat 1 R Lt. 7 Ke Lt. 8
        g.addEdge(230, 231, 515); // Tangga Darurat 1 R Lt. 8 - Toilet R Lt. 8
        g.addEdge(230, 232, 1780); // Tangga Darurat 1 R Lt. 8 - R8. 01
        g.addEdge(231, 236, 815); // Toilet R Lt. 8 - R8. 05
        g.addEdge(232, 243, 775); // R8. 01 - R8. 03
        g.addEdge(236, 235, 775); // R8. 05 - R8. 04
        g.addEdge(234, 236, 1175); // R8. 03 - R8. 05
        g.addEdge(235, 237, 1175); // R8. 04 - R8. 06
        g.addEdge(236, 238, 175); // R8. 05 - Tangga Darurat 2 R Lt. 8
        g.addEdge(237, 238, 1020); // R8. 06 - Tangga Darurat 2 R Lt. 8
        g.addEdge(213, 238, 1020); // Tangga Darurat 2 R Lt. 7 - Tangga Darurat 2 R Lt. 8 -----> (5) Tangga Darurat 2 R Lt. 7 Ke Lt. 8
         // - Lantai 9 - Gedung R (Kanan ke Kiri)
        g.addEdge(239, 240, 230); // LAB. Pemograman 6 - Tangga Darurat 1 R Lt. 9
        g.addEdge(230, 240, 1057); // Tangga Darurat 1 R Lt. 8 - Tangga Darurat 1 R Lt. 9 -----> (1) Tangga Darurat 1 R Lt. 8 Ke Lt. 9
        g.addEdge(240, 241, 515); // Tangga Darurat 1 R Lt. 9 - Toilet R Lt. 9
        g.addEdge(241, 242,815); // Toilet R Lt. 9 - R9. 02
        g.addEdge(240, 243,1955); // Tangga Darurat 1 R Lt. 9 - LAB. Pemograman 5
        g.addEdge(242, 244,1950); // R9. 02 - LAB. Pemograman 4
        g.addEdge(243, 245,1775); // LAB. Pemograman 5 - R9. 05
        g.addEdge(245, 246,715); // R9. 05 - Tangga Darurat 2 R Lt. 9
        g.addEdge(244, 246,1020); // LAB. Pemograman 4 - Tangga Darurat 2 R Lt. 9
        g.addEdge(238, 246,1775); // Tangga Darurat 2 R Lt. 8 - Tangga Darurat 2 R Lt. 9 -----> (2) Tangga Darurat 2 R Lt. 8 Ke Lt. 9

        // - Lantai 10 - Gedung R (Kanan ke Kiri)
        g.addEdge(247, 248, 475); // Ruang Dosen FTI - Tangga Darurat 1 R Lt. 10
        g.addEdge(240, 248, 1057); // Tangga Darurat 1 R Lt. 9 - Tangga Darurat 1 R Lt. 10 -----> (1) Tangga Darurat 1 R Lt. 9 Ke Lt. 10
        g.addEdge(248, 249, 515); // Tangga Darurat 1 R Lt. 10 - Toilet R Lt. 10
        g.addEdge(249, 250, 815); // Toilet R Lt. 10 - Ruangan Maintenance Hardware
        g.addEdge(248, 251, 1780); // Tangga Darurat 1 R Lt. 10 - Ruang Asisten Dosen FTI
        g.addEdge(250, 253, 175); // Ruangan Maintenance Hardware - Ruang Server
        g.addEdge(251, 252, 175); // Ruang Asisten Dosen FTI - LAB. Pemograman 7
        g.addEdge(252, 254, 600); // LAB. Pemograman 7 - Ruang 1 R Lt. 10
        g.addEdge(253, 255, 600); // Ruang Server - Ruang 2 R Lt. 10
        g.addEdge(254, 257, 1175); // Ruang 1 R Lt. 10 - Gudang R Lt. 11
        g.addEdge(255, 256, 1175); // Ruang 2 R Lt. 10 - LAB. Pemograman 1
        g.addEdge(257, 258, 715); // Gudang R Lt. 11 - Tangga Darurat 2 R Lt. 10
        g.addEdge(256, 258, 1020); // LAB. Pemograman 1 - Tangga Darurat 2 R Lt. 10
        g.addEdge(246, 258, 1020); // Tangga Darurat 2 R Lt. 9 - Tangga Darurat 2 R Lt. 10 -----> (2) Tangga Darurat 2 R Lt. 9 Ke Lt. 10

        // - Lantai 11 - Gedung R (Kanan ke Kiri)
        g.addEdge(259, 260, 480); // Ruang Rapat Lt. 11 - Ruang Seminar Gd.R
        g.addEdge(260, 261, 475); // Ruang Seminar Gd.R - Tangga Darurat 1 R Lt. 11
        g.addEdge(248, 261, 1057); // Tangga Darurat 1 R Lt. 10 - Tangga Darurat 1 R Lt. 11 -----> (1) Tangga Darurat 1 R Lt. 10 Ke Lt. 11
        g.addEdge(261, 262, 515); // Tangga Darurat 1 R Lt. 11 - Toilet R Lt. 11
        g.addEdge(262, 264, 815); // Toilet R Lt. 11 - Ruang Peminjaman Mutu
        g.addEdge(261, 263, 1780); // Tangga Darurat 1 R Lt. 11 - Ruangan Sidang A FTI
        g.addEdge(263, 266, 175); // Ruangan Sidang A FTI - Kesekretariatan Fakultas Teknologi Informasi B
        g.addEdge(264, 265, 175); // Ruang Peminjaman Mutu - Ruang Sidang B FTI
        g.addEdge(266, 267, 600); // Kesekretariatan Fakultas Teknologi Informasi B - Kesekretariatan Fakultas Teknologi Informasi A
        g.addEdge(265, 267, 600); // Ruang Sidang B FTI - Kesekretariatan Fakultas Teknologi Informasi A
        g.addEdge(267, 268, 1812); // Kesekretariatan Fakultas Teknologi Informasi A - Tangga Darurat 2 R Lt. 11
        g.addEdge(258, 268, 1020); // Tangga Darurat 2 R Lt. 10 - Tangga Darurat 2 R Lt. 11 -----> (2) Tangga Darurat 2 R Lt. 10 Ke Lt. 11

        // - Lantai 12 - Gedung R (Kanan ke Kiri)
        g.addEdge(269, 270, 320); // Galeri FTI UNTAR - Tangga Darurat 1 R Lt. 12
        g.addEdge(261, 270, 1057); // Tangga Darurat 1 R Lt. 11 - Tangga Darurat 1 R Lt. 12 -----> (1) Tangga Darurat 1 R Lt. 11 Ke Lt. 12
        g.addEdge(270, 271, 515); // Tangga Darurat 1 R Lt. 12 - Toilet R Lt. 12
        g.addEdge(270, 272, 1385); // Tangga Darurat 1 R Lt. 12 - Mushola R Lt. 12
        g.addEdge(271, 273, 815); // Toilet R Lt. 12 - LAB. Mobile Porgraming
        g.addEdge(272, 274, 395); // Mushola R Lt. 12 - LAB. Enterprise Database
        g.addEdge(274, 275, 175); // LAB. Enterprise Database - LAB. Business Intelligence
        g.addEdge(275, 276, 600); // LAB. Business Intelligence - LAB. Data Science
        g.addEdge(273, 277, 1200); // LAB. Mobile Porgraming - LAB. Pemograman 9
        g.addEdge(276, 278, 600); // LAB. Data Science - LAB. Intelligent System
        g.addEdge(278, 279, 575); // LAB. Intelligent System - LAB. Game Developer
        g.addEdge(279, 280, 715); // LAB. Game Developer - Tangga Darurat 2 R Lt. 12
        g.addEdge(277, 280, 1770); // LAB. Pemograman 9 - Tangga Darurat 2 R Lt. 12
        g.addEdge(268, 280, 1020); // Tangga Darurat 2 R Lt. 11 - Tangga Darurat 2 R Lt. 12 -----> (2) Tangga Darurat 2 R Lt. 11 Ke Lt. 12

      
        
        Graph.Result result = g.dijkstra(0);

        String[] roomName = new String[V];

        // Lantai 1 - Gedung L
        roomName[0] = "Titik Evakuasi 1";
        roomName[1] = "LAB. TTL";
        roomName[2] = "LAB. CAD-CAM";
        roomName[3] = "LAB. Fisika";
        roomName[4] = "Tangga Darurat 2 L Lt.1";
        roomName[5] = "Toilet L Lantai 1";
        roomName[6] = "LAB. CNC";
        roomName[7] = "LAB. Mekatronika 1";
        roomName[8] = "LAB. Mekatronika 2";
        roomName[9] = "LAB. Proses Produksi";
        roomName[10] = "LAB. Prestasi Mesin";
        roomName[11] = "Tangga Darurat 1 L Lt. 1";

        // Lantai 1 - Gedung K
        roomName[12] = "Tarumanagara Human Cell Technology LAB.";
        roomName[13] = "Toilet Perempuan K Lt.1";
        roomName[14] = "Toilet Laki-Laki K Lt.1";
        roomName[15] = "Dr. Widodo Kushartomo";
        roomName[16] = "LAB. Geologi Dan Mekanika Tanah";
        roomName[17] = "LAB. Kontruksi Dan Teknologi Beton";
        roomName[18] = "Tangga Darurat 1 K Lt. 1";
        roomName[19] = "Gudang K Lt. 1";

        // Lantai 1 - Gedung R
        roomName[20] = "Ruang Pompa K-R";
        roomName[21] = "Aula Gedung R";
        roomName[22] = "Tangga Darurat 1 R Lt.1";
        roomName[23] = "Toilet R Lt. 1";
        roomName[24] = "LAB. Dinamika Fluida";
        roomName[25] = "LAB. Jalan Raya dan Transportasi";
        roomName[26] = "Tangga Darurat 1 R Lt. 1";

        // Lantai 2 - Gedung L
        roomName[27] = "Perpustakaan Teknik";
        roomName[28] = "Tangga Darurat 2 L Lt.2";
        roomName[29] = "Toilet L Lantai 2";
        roomName[30] = "Tarumanagara Psychology Center";
        roomName[31] = "Perpustakaan Ilmu Psikologi";
        roomName[32] = "LAB. Observasi";
        roomName[33] = "Gudang L Lt. 2";
        roomName[34] = "Tangga Darurat 1 L Lt. 2";

        // Lantai 2 - Gedung K
        roomName[35] = "Toilet Perempuan K Lt. 2";
        roomName[36] = "Toilet Laki-Laki K Lt. 2";
        roomName[37] = "K. 301";
        roomName[38] = "Sekretariat Psikologi";
        roomName[39] = "Tangga Darurat 1 K Lt. 2";
        roomName[40] = "Ruang Sidang Skripsi K Lt. 2";
        roomName[41] = "Ruang Dosen Psikologi";

    // Lantai 2 - Gedung R
        roomName[42] = "Tangga Darurat 1 R Lt. 2";
        roomName[43] = "Toilet R Lt. 2";
        roomName[44] = "R2. 02";
        roomName[45] = "R2. 01";
        roomName[46] = "R2. 04";
        roomName[47] = "LAB. Bermain Anak";
        roomName[48] = "LAB. Neuropsikologi";
        roomName[49] = "LAB. Psikologi Kreativitas";
        roomName[50] = "Tangga Darurat 2 R Lt. 2";
        roomName[51] = "Academic Hub L Lt. 3";
        roomName[52] = "Tangga Darurat 2 L Lt. 3";
        roomName[53] = "Toilet L Lantai 3";
        roomName[54] = "LAB. Implementasi & Elektronika Cerdas";
        roomName[55] = "Sekretariat L Lt. 3";
        roomName[56] = "LAB. Instrumentasi & Pengukuran";
        roomName[57] = "LAB. Inovasi SIstem Otomasi & Ros";
        roomName[58] = "LAB. Fenomena Mesin";
        roomName[59] = "LAB. Hidrolik & Pneumatik";
        roomName[60] = "LAB. Metalurgi Fisik";
        roomName[61] = "Tangga Darurat 1 L Lt. 3";
        roomName[62] = "Ruang Kelas K Lt. 4";
        roomName[63] = "Toilet Perempuan K Lt. 3";
        roomName[64] = "Toilet Laki-Laki K Lt. 3";
        roomName[65] = "K. 301";
        roomName[66] = "K. 302";
        roomName[67] = "K. 303";
        roomName[68] = "K. 304";
        roomName[69] = "Ruang Penyimpanan ATK K Lt.3";
        roomName[70] = "Ruang Sekretariat Gedung K Lt. 3";
        roomName[71] = "Tangga Darurat 1 K Lt. 3";
        roomName[72] = "K. 305";
        roomName[73] = "SMART CLASSROOM";
        roomName[74] = "K. 307";
        roomName[75] = "Studio Bahan Interior R Lt. 3";
        roomName[76] = "Sekretariat Program Studi Magister Psikologi";
        roomName[77] = "Tangga Darurat 1 R Lt. 3";
        roomName[78] = "Toilet R Lt. 3";
        roomName[79] = "Ruang Konseling 1";
        roomName[80] = "Ruang Konseling 2";
        roomName[81] = "R3. 01";
        roomName[82] = "Ruang Diskusi 2";
        roomName[83] = "Ruang Diskusi 1";
        roomName[84] = "Ruang Dosen Tidak Tetap";
        roomName[85] = "R3. 03";
        roomName[86] = "Mushola R Lt. 3";
        roomName[87] = "LAB. Konseling Psikologi";
        roomName[88] = "R3. 05";
        roomName[89] = "Tangga Darurat 2 R Lt. 3";
        roomName[90] = "Academic Hub L Lt. 4";
        roomName[91] = "Tangga Darurat 2 L Lt. 4";
        roomName[92] = "Toilet L Lantai 4";
        roomName[93] = "Ruang Dosen L Lt. 4";
        roomName[94] = "L. 405";
        roomName[95] = "L. 408";
        roomName[96] = "L. 407";
        roomName[97] = "Ruang Gudang L Lt. 4";
        roomName[98] = "L. 409";
        roomName[99] = "Studio Audio Visual";
        roomName[100] = "L. 411";
        roomName[101] = "Tangga Darurat 1 L Lt. 4";
        roomName[102] = "Toilet Perempuan K Lt. 4";
        roomName[103] = "Toilet Laki-Laki K Lt. 4";
        roomName[104] = "Mushola Pantry Arsip";
        roomName[105] = "Ruang Rapat";
        roomName[106] = "Sekretariat FSRD";
        roomName[107] = "Ruang Penyimpanan ATK K Lt. 4";
        roomName[108] = "Studio FOTOGRAFI";
        roomName[109] = "Tangga Darurat 1 K Lt. 4";
        roomName[110] = "Ruang Seminar K Lt. 4";
        roomName[111] = "Studio Bahan Interior K Lt. 4";
        roomName[112] = "Loket Pelayanan Program Studi DKV";
        roomName[113] = "Tangga Darurat 1 R Lt. 4";
        roomName[114] = "Toilet R Lt. 4";
        roomName[115] = "R4. 02";
        roomName[116] = "R4. 01";
        roomName[117] = "R4. 04";
        roomName[118] = "R4. 03";
        roomName[119] = "Tangga Darurat 2 R Lt. 4";
        roomName[120] = "Academic Hub L Lt. 5";
        roomName[121] = "Tangga Darurat 2 L Lt. 5";
        roomName[122] = "Toilet L Lantai 5";
        roomName[123] = "Ruang Dosen L Lt. 5";
        roomName[124] = "L. 505";
        roomName[125] = "L. 506";
        roomName[126] = "Ruang Gudang L Lt. 5";
        roomName[127] = "L. 507";
        roomName[128] = "L. 508";
        roomName[129] = "L. 509";
        roomName[130] = "L. 510";
        roomName[131] = "Tangga Darurat 1 L Lt. 5";
        roomName[132] = "Toilet Perempuan K Lt. 5";
        roomName[133] = "Toilet Laki-Laki K Lt. 5";
        roomName[134] = "Studio Grafis";
        roomName[135] = "Ruang Gambar";
        roomName[136] = "Ruang Pencahayaan";
        roomName[137] = "Ruang Fotografi";
        roomName[138] = "Pantry K Lt. 5";
        roomName[139] = "Gudang K Lt. 5";
        roomName[140] = "Ruang Diskusi";
        roomName[141] = "Studio DKV";
        roomName[142] = "Ruang Dosen FSRD";
        roomName[143] = "Studio Komputer DKV";
        roomName[144] = "Ruang Dosen Interior";
        roomName[145] = "Tangga Darurat 1 K Lt. 5";
        roomName[146] = "Ruang Kelas K Lt. 5";
        roomName[147] = "Loket Pelayanan Program Studi Interior";
        roomName[148] = "Ruang Tunggu";
        roomName[149] = "Tangga Darurat 1 R Lt. 5";
        roomName[150] = "Toilet R Lt. 5";
        roomName[151] = "R5. 01";
        roomName[152] = "R5. 02";
        roomName[153] = "R5. 03";
        roomName[154] = "Ruang Dosen Psikologi";
        roomName[155] = "R5. 04";
        roomName[156] = "R5. 05";
        roomName[157] = "R5. 06";
        roomName[158] = "R5. 07";
        roomName[159] = "R5. 08";
        roomName[160] = "Ruang Sekretariat S1 Psikologi";
        roomName[161] = "Ruang Ketua Prodi Psikologi";
        roomName[162] = "Ruang Dosen S1 Psikologi";
        roomName[163] = "Gudang R Lt. 5";
        roomName[164] = "R5. 09";
        roomName[165] = "R5. 10";
        roomName[166] = "Tangga Darurat 2 R Lt. 5";
        roomName[167] = "Toilet Laki-Laki K Lt. 6";
        roomName[168] = "Toilet Perempuan K Lt. 6";
        roomName[169] = "Ruang Kelas K Lt. 6";
        roomName[170] = "Studio Interior";
        roomName[171] = "Gudang Interior";
        roomName[172] = "Ruang Kepala Lab";
        roomName[173] = "Pantry Lt. 6";
        roomName[174] = "Ruang Diskusi K Lt. 6";
        roomName[175] = "Tangga Darurat 1 K Lt. 6";
        roomName[176] = "Ruang Kerja Dosen Interior";
        roomName[177] = "Ruang Rapat K Lt. 6";
        roomName[178] = "Ruang Gambar Interior";
        roomName[179] = "Ruang Bahan dan Alat Interior";
        roomName[180] = "R6. 01";
        roomName[181] = "R6. 02";
        roomName[182] = "R6. 03";
        roomName[183] = "R6. 04";
        roomName[184] = "R6. 05";
        roomName[185] = "Tangga Darurat 2 R Lt. 6";
        roomName[186] = "Sekretariat Jurusan Arsitektur & Perencanaan";
        roomName[187] = "Tangga Darurat 2 L Lt. 7";
        roomName[188] = "Toilet L Lantai 7";
        roomName[189] = "L. 701";
        roomName[190] = "L. 702";
        roomName[191] = "L. 703";
        roomName[192] = "L. 704";
        roomName[193] = "L. 705";
        roomName[194] = "L. 706";
        roomName[195] = "L. 707";
        roomName[196] = "Tangga Darurat 1 L Lt. 7";
        roomName[197] = "Toilet Perempuan K Lt. 7";
        roomName[198] = "K. 706";
        roomName[199] = "Toilet Laki-Laki K Lt. 7";
        roomName[200] = "K. 702";
        roomName[201] = "K. 701";
        roomName[202] = "Gudang K Lt. 7";
        roomName[203] = "Tangga Darurat 1 K Lt. 7";
        roomName[204] = "K. 707";
        roomName[205] = "K. 705";
        roomName[206] = "Gudang 2 R Lt. 7";
        roomName[207] = "Gudang 1 R Lt. 7";
        roomName[208] = "Ruang Organisasi FTI";
        roomName[209] = "Tangga Darurat 1 R Lt. 7";
        roomName[210] = "Toilet R Lt. 7";
        roomName[211] = "R7. 01";
        roomName[212] = "R7. 02";
        roomName[213] = "R7. 04";
        roomName[214] = "R7. 05";
        roomName[215] = "R7. 06";
        roomName[216] = "Tangga Darurat 2 R Lt. 7";
        roomName[217] = "Ruang TGA";
        roomName[218] = "Tangga Darurat 2 L Lt. 8";
        roomName[219] = "L. Ruang Fisika Bangunan";
        roomName[220] = "Toilet L Lantai 8";
        roomName[221] = "L. 801";
        roomName[222] = "L. 802";
        roomName[223] = "L. 803";
        roomName[224] = "L. 804";
        roomName[225] = "L. 805";
        roomName[226] = "L. 806";
        roomName[227] = "Tangga Darurat 1 L Lt. 8";
        roomName[228] = "Toilet Perempuan K Lt. 8";
        roomName[229] = "Toilet Laki-Laki K Lt. 8";
        roomName[230] = "Studio Arsitektur";
        roomName[231] = "Studio Tugas Akhir Lt. 8 R";
        roomName[232] = "Gudang DKV R Lt. 8";
        roomName[233] = "Tangga Darurat 1 R Lt. 8";
        roomName[234] = "Toilet R Lt. 8";
        roomName[235] = "R8. 01";
        roomName[236] = "R8. 02";
        roomName[237] = "R8. 03";
        roomName[238] = "R8. 04";
        roomName[239] = "R8. 05";
        roomName[240] = "R8. 06";
        roomName[241] = "Tangga Darurat 2 R Lt. 8";
        roomName[242] = "LAB. Pemograman 6";
        roomName[243] = "Tangga Darurat 1 R Lt. 9";
        roomName[244] = "Toilet R Lt. 9";
        roomName[245] = "R9. 02";
        roomName[246] = "LAB. Pemograman 5";
        roomName[247] = "LAB. Pemograman 4";
        roomName[248] = "R9. 05";
        roomName[249] = "Tangga Darurat 2 R Lt. 9";
        roomName[250] = "Ruang Dosen FTI";
        roomName[251] = "Tangga Darurat 1 R Lt. 10";
        roomName[252] = "Toilet R Lt. 10";
        roomName[253] = "Ruangan Maintenance Hardware";
        roomName[254] = "Ruang Asisten Dosen FTI";
        roomName[255] = "LAB. Pemograman 7";
        roomName[256] = "Ruang Server";
        roomName[257] = "Ruang 1 R Lt. 10";
        roomName[258] = "Ruang 2 R Lt. 10";
        roomName[259] = "LAB. Pemograman 1";
        roomName[260] = "Gudang R Lt. 11";
        roomName[261] = "Tangga Darurat 2 R Lt. 10";
        roomName[262] = "Ruang Rapat Lt. 11";
        roomName[263] = "Ruang Seminar Gd.R";
        roomName[264] = "Tangga Darurat 1 R Lt. 11";
        roomName[265] = "Toilet R Lt. 11";
        roomName[266] = "Ruangan Sidang A FTI";
        roomName[267] = "Ruang Peminjaman Mutu";
        roomName[268] = "Ruang Sidang B FTI";
        roomName[269] = "Kesekretariatan Fakultas Teknologi Informasi B";
        roomName[270] = "Kesekretariatan Fakultas Teknologi Informasi A";
        roomName[271] = "Tangga Darurat 2 R Lt. 11";
        roomName[272] = "Galeri FTI UNTAR";
        roomName[273] = "Tangga Darurat 1 R Lt. 12";
        roomName[274] = "Toilet R Lt. 12";
        roomName[275] = "Mushola R Lt. 12";
        roomName[276] = "LAB. Mobile Porgraming";
        roomName[277] = "LAB. Enterprise Database";
        roomName[278] = "LAB. Business Intelligence";
        roomName[279] = "LAB. Data Science";
        roomName[280] = "LAB. Pemograman 9";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama ruangan : ");
        String input = scanner.nextLine().trim();

        int tujuan = g.findRoom(roomName, input);

        if (tujuan == -1) {
            System.out.println("Ruangan tidak ditemukan!");
        } else {
            System.out.println("Jarak dari " + roomName[0] + " ke " + roomName[tujuan] + " = " + (result.distance[tujuan]/100)+" M");

            if (result.distance[tujuan] == Double.POSITIVE_INFINITY) {
                System.out.println("Tidak ada jalur");
            } else {
                System.out.println("Jalur: ");
                for (int v : g.getPath(result.predecessor, tujuan)) {
                    System.out.print(roomName[v]+" -> ");
                }
                System.out.println("Selesai");
            }
        }
        scanner.close();
    }

}
