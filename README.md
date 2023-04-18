# GlideExample

<h1>Glide Kütüphanesi ile Resim Yükleme ve BaseAdapter Kullanarak Liste Görünümü Oluşturma</h1>
<p>Bu örnek projede, Glide kütüphanesi kullanılarak resim yükleme işlemi gerçekleştirilir ve BaseAdapter sınıfı kullanılarak liste görünümü oluşturulur.</p>

<h2>Kullanılan Bağımlılıklar</h2>
<pre><code>implementation 'com.github.bumptech.glide:glide:4.12.0'</code></pre>

<h2>Manifest Dosyası</h2>
<pre><code>&lt;uses-permission android:name="android.permission.INTERNET"/&gt;</code></pre>

<h2>Örnek Kodlar</h2>
<p>Kütüphane eklemek için import işlemi:</p>
<pre><code>import com.bumptech.glide.Glide</code></pre>

<p>Glide kütüphanesi ile resim yükleme işlemi:</p>
<pre><code>Glide.with(context).load(user.image).into(r_image);</code></pre>
<p><code>with()</code> -> Glide'ın kullanılacağı aktivite.</p>
<p><code>load()</code> -> Resmin yolu.</p>
<p><code>into()</code> -> Resmin yükleneceği imageView.</p>

<h2>Uygulama Ekran Görüntüsü</h2>
<p float="left">
  <img src="https://user-images.githubusercontent.com/100219838/232799683-db1d43e0-b05a-474b-a1d4-e2db08b56a19.png" width="30%" />
</p>
