# InterfaceAbstractDemo
<font color="orange">SOLID</font> presnsiplerine uygun şekilde <font color="orange">Mernis Web Service</font> alt yapısı kullanılarak kullanıcı TC,İsim,Soyisim ve Doğum yılı bilgileri teyit edecek back-end tasarlandı.

## Mernis İmplementasyonu
- Projeye sağ tıkla new -> other -> web service client
- Service definition için link : https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?wsdl
- Finish de ekleyecektir.

Lakin benim gibi javaSE-15 ile compile ediyor ise projeniz eklenen servis hata verecektir. Bunun için
projeye sağ tıklayıp
properties -> Java Compiler -> Use compliance from.. tikini kaldırıp -> 1.8 'i seçerseniz sorunsuz çalışacaktır.
