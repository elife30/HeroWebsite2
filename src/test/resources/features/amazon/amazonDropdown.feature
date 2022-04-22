Feature:Dropdown homepage


  #burada dropdown nasil calisir onu anlamaya calisiyorum.dropdown calismasi icin Select olmasi zorunluymus.
  # herositesinde selectli olmadigi icin amazonun dropdownunun deneyecegim
  #given :ile siteye girme kodunu yazdik burada onemli olan common methotdan kullanamam cunku yeni bir sitede giris nasil yapilir.
  #,,dogan reuseable kod yazdi sadece site ismini yazaraktan kullanabilirisn orada bir eksiklikk varmis
  # koda parametre ekleyince featureden kullanabilir hale geldi
  #,,ben de basit direk siteyi manuel yazacagin kodu yazdim ismi user amazon dedim tek kullanimlik.

   #When:kismi kolay locatorini buldum,webelemente esitledim,click yaptim
  #-----:burada asil dropdown yapilisinin kodlarini yazacagim.select klasini cagirmak icin once select objectini kurdum .
  # selectin icine parametre olarak locaterin ismini yazdim.alt kisma select . diyince methodlar acildi,index,value,visibletext ile sec
  #select diyince tikliyor mu nasil yazdiririm?nasil yazilani elde ederim? searche basip sonra acilan sayfada title almak lazimmis.
  # bu yuzden yeni bir THen ile click ekledik
  #find element ile selecti ayirmistim bu yanlis olmus sanirim ikisi tek scenarioda olmali.

  #close kismini: daha onceden hazir olan commom methodta methodu yazilmis ve loginpage stepinde bir feature ile eslesmis oldugundan
  #ben o featurede yazani direk yazarak kullanabildim.


  Scenario: dropdown clickable
    Given user  is open browser and navigates to webpage "https://www.amazon.com/"
    When user clicks All button and select
    Then user clicks search button
    Then user close the browser


    #Given user amazon
  #usteki givenin yedegi:)