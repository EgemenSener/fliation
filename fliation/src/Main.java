
import java.util.Scanner;

  
 //<editor-fold defaultstate="collapsed" desc="GUI">
       
         
    
      //</editor-fold> 
/**
 *
 * @author Egemen
 */
public class Main {
    
    public static void main(String[] args){
         
        String temp_name;
        int temp_age;
        String temp_address = null;
        long temp_phone;
        int temp_hes_code;
        String temp_job;
        String temp_department = null;
        int temp_id;
        int j = 0;
        int z = 0;
        
        Person st[] = new Person[51];
        Scanner scanner = new Scanner(System.in);
        
        
        st[0] = new Employee ("Ali","Şair Ziya Paşa Cad. Akgün Iş Hanı No:37 Karaköy/ISTANBUL",12305697,10000,33,"computer engineer","AR-GE",1);
        st[1] = new Person ("Ozan","Altınpaşa Mah. 34.Sok. No:13 Çankaya/ANKARA",25641789,10010,19);
        st[2] = new Employee ("Burak","Beyazdiş Cad. Kale Apt. No:3 Yenimahalle/ANKARA",52489617,10020,50,"doctor","pediatrician",256);
        st[3] = new Employee ("Irmak","Kahraman Mah. Kıvrımlı Sok. Yalın Apt. No:5 Karşıyaka/İZMİR",20158796,10030,28,"nurse","otolaryngology",112);
        st[4] = new Employee ("Ege","Altınpaşa Mah. 34.Sok. No:13 Çankaya/ANKARA",36487510,10040,38,"teacher","faculty of law",324);
        st[5] = new Person ("Ece","Kıvrımlı Cad. Oğultürk Apt. No:11 Bakırköy/ISTANBUL",48512697,10050,22);
        st[6] = new Person ("Deniz","Şair Ziya Paşa Cad. Akgün Iş Hanı No:37 Karaköy/ISTANBUL",12648000,10060,10);  
        st[7] = new Employee ("Akın","Ziya Gökalp Cad. Pervin Apt. No:28 Manavgat/ANTALYA",14875222,10070,30,"computer engineer","software developer",255);
        st[8] = new Employee ("Başak","Beyazdiş Cad. Kale Apt. No:3 Yenimahalle/ANKARA" ,2156487,10080,48,"teacher","faculty of law",78);
        st[9] = new Person ("Duygu","Alacaatlı Mah. Denzi Apt. No:10 Akyaka/MUĞLA",1489627,10090,78);
        st[10] = new Person ("Ata","Kahraman Mah. Kıvrımlı Sok. Yalın Apt. No:5 Karşıyaka/İZMİR",21045788,10100,33);
        st[11] = new Employee ("İlayda","Denizoğlu Mah. 114.Sok. No:11 Gazipaşa/ANTALYA",5548874,10110,24,"computer engineer","AR-GE",852); 
        st[12] = new Employee ("Uğur","Batıkent Mah. Yanar Sok. No:23 Batıkent/ANKARA",25488899,10120,33,"republic relations","marketing",174);
        st[13] = new Person ("Alara","Altınpaşa Mah. 34.Sok. No:13 Çankaya/ANKARA",1248759,10130,21);
        st[14] = new Employee ("Elif","Mutlukent Mah. No:7 Lara/ANTALYA",55481512,10140,53,"doctor","psychiartry",221);
        st[15] = new Employee ("Gökhan","Kahraman Mah. Kıvrımlı Sok. Yalın Apt. No:5 Karşıyaka/İZMİR",32548796,10150,28,"nurse","brain surgery",135);
        st[16] = new Employee ("Umut","Mutlukent Mah. No:7 Lara/ANTALYA",20154477,10160,32,"teacher","faculty of law",754);
        st[17] = new Person ("Büşra" ,"Porsuklar Cad. Yarım Sok. No:33 Mahmudiye/Eskişehir",20144599,10170,27);
        st[18] = new Person ("Derin","Birlik Mah. Kalamış Sok. No:45 Bornova/İZMİR",74521320,10180,13);
        st[19] = new Employee ("Bayram","Kalamış Sok. No:45 Bornova/İZMİR",2145589,10190,30,"computer engineer","software developer",720);
        st[20] = new Employee ("Özge","Karagümrük Cad. Kıvrılmış Sok. No:22 Narlıdere/İZMİR",21035647,10200,48,"teacher","faculty of managment",288);
        st[21] = new Person ("Meltem","Alacaatlı Mah. Denzi Apt. No:10 Akyaka/MUĞLA",54200200,10210,68);
        st[22] = new Person ("Uğur","Bulutlar Sok. No:11 Örenşehir/ANTALYA",54781200,10220,31);
        st[23] = new Employee ("Dicle","Denizci Mah. 88.Sok. No:18 Of/Trabzon",2211099,10230,24,"machanical engineer","design department",987);
        st[24] = new Employee ("Erol","Birlik Mah. Kalamış Sok. No:45 Bornova/İZMİR",45632001,10240,35,"managment","marketing",453);
        st[25] = new Person ("Eren","Yenifoça Sok. No:6 Kulu/KONYA",75894120,10250,29);
        st[26] = new Employee ("Güney","Beyazdiş Cad. Kale Apt. No:3  Yenimahalle/ANKARA",2314587,10260,56,"dentist","orthodontics",111);
        st[27] = new Employee ("Berrak","Sarma Sok. No:17 Manavgat/ANTALYA",78854166,10270,26,"nurse","radiolog",995);
        st[28] = new Employee ("Sıla","Alacaatlı Mah. Denzi Apt. No:10 Akyaka/MUĞLA",2365478,10280,31,"machanical engineer","design department",314);
        st[29] = new Person ("Murat","Kıvrımlı Cad. Kahraman Apt. No:11 Pendik/ISTANBUL",45877563,10290,24);
        st[30] = new Person ("Barış","Denizli Cad. Peri Sok. No:9 Pamukkale/DENİZLİ",77553362,10300,15);
        st[31] = new Employee ("Ecem","Büklüm Sok. No:20 Mamak/ANKARA",45987459,10310,39,"computer engineer","software developer",257);
        st[32] = new Employee ("Burçin","Porsuklar Cad. Yarım Sok. No:33 Mahmudiye/Eskişehir",12589966,10320,28,"teacher","faculty of engineer",378);
        st[33] = new Person ("Duru","Dilkum Cad. No:8 Tarsus/MERSİN",74185296,10330,32);
        st[34] = new Person ("Can","Dilkum Cad. No:8 Tarsus/MERSİN",75321459,10340,38);
        st[35] = new Employee ("Ali","Denizoğlu Mah. 114.Sok. No:11 Gazipaşa/ANTALYA",36988774,10350,26,"computer engineer","AR-GE",1852); 
        st[36] = new Employee ("Demet","Şair Ziya Paşa Cad. Akgün Iş Hanı No:37 Karaköy/ISTANBUL",02365650,10360,37,"nurse","pediatri",3221);
        st[37] = new Person ("Atlas", "Karapürçek Mah. No:9 Ziyapaşa/ADANA",85236974,10370,88);
        st[38] = new Employee ("Berk","Beyazdiş Cad. Kaleiçi Apt. No:7 Çankaya/ANKARA",45632178,10380,56,"doctor","pediatrician",1756);
        st[39] = new Employee ("İrem","Kahraman Mah. Sarmal Sok. No:5 Bornova/İZMİR",95147536,10390,27,"nurse","otolaryngology",1112);
        st[40] = new Employee ("Egemen","Kızılpaşa Mah. 38.Sok. No:13 Mamak/ANKARA",75321596,10400,38,"teacher","faculty of law",724);
        st[41] = new Person ("Ceren","Kıvrımlı Cad. Oğultürk Apt. No:11 Bakırköy/ISTANBUL",2313258,10410,27);
        st[42] = new Person ("Derin","Şair Murat Paşa Cad. No:37 Tuzla/ISTANBUL",85974632,10420,12);  
        st[43] = new Employee ("Azra","Ziya Gökalp Cad. Pervin Apt. No:28 Manavgat/ANTALYA",15266988,10430,32,"graphic artist","sale department",5255);
        st[44] = new Employee ("Burçak","Beyazdiş Cad. Kaleiçi  Apt. No:7 Yenimahalle/ANKARA",8597441,10440,48,"teacher","faculty of engineer",783);
        st[45] = new Person ("Duygu","Şair Murat Paşa Cad. No:37 Tuzla/ISTANBUL",1487427,10450,18);
        st[46] = new Person ("Bilge","Karaman Mah. Dönüm Sok. No:7 Karşıyaka/İZMİR",45698741,10460,22);
        st[47] = new Employee ("İpek","Denizoğlu Mah. 114.Sok. No:11 Gazipaşa/ANTALYA",12588966,10470,24,"computer engineer","software developer",272); 
        st[48] = new Employee ("Uğur","Şair Murat Paşa Cad. No:37 Tuzla/ISTANBUL",25777839,10480,37,"republic relations","sale department",124);
        st[49] = new Person ("Açelya","Altınpaşa Mah. 34.Sok. No:13 Çankaya/ANKARA",1248719,10490,21);
        st[50] = new Employee ("Cüneyt","Mutlukent Mah. No:7 Lara/ANTALYA",69321458,10500,53,"doctor","oncology",852);


        

        System.out.println("Please enter the ill person hes code: ");
        temp_hes_code = scanner.nextInt();
        
        
         for(int i = 0; i<st.length; i++) {
         
             
             
            if(st[i].getHes_code() == temp_hes_code){
                
                j = i;
                System.out.println("The data of the person whose account code you have entered is as follows: ");
                st[j].showInfos();
                   temp_name =  st[j].getName();
                   temp_age = st[j].getAge();
                   temp_address = st[j].getAddress();
                   temp_phone = st[j].getPhone();
                   temp_job = st[j].getJob();
                   temp_department = st[j].getDepartment();
                   temp_id = st[j].getId();
                   
            }
         
                 
      }
        
        System.out.println("The persons given below are in contact and need to be quarantined ");
        for(int i = 0; i<st.length; i++) {
            
            if(temp_address != null){
                if(st[i].getAddress().equals(temp_address)){
                    
                    System.out.println("Risky since it is from the same family: ");
                    st[i].showInfos();
                }
                
            }
            else if(temp_department != null){
                
                if(st[i].getDepartment().equals(temp_department)){
                
                System.out.println("Risky because working in the same department: ");
                st[i].showInfos();
            }
            else{
                    
                System.out.println("no matches found ! ");
                
                }
            
            }
         
               
      }
           
        
        
        
        //new Person("Ozan", "Yenimahalle / ANKARA", 6217648624l, 10450, 19);
        
    
    }
    }

