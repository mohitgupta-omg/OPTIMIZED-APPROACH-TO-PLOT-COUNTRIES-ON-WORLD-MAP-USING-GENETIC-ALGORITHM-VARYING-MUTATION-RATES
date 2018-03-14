
package genetic_algorithm_optimisation_with_mutationrates;
import genetic_algorithm_optimisation_with_mutationrates.*;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Genetic_Algorithm_Optimisation_with_MutationRates
{
    public static void main(String[] args)
    {

        Country Andorra = new Country ((double)42.546245 , (double)1.601554);
        ManageTour.addCountry (Andorra);

        Country United_Arab_Emirates = new Country ((double)23.424076 , (double)53.847818);
        ManageTour.addCountry (United_Arab_Emirates);

        Country Afghanistan = new Country ((double)33.93911 , (double)67.709953);
        ManageTour.addCountry (Afghanistan);

        Country Antigua_Barbuda = new Country ((double)17.060816 , (double)-61.796428);
        ManageTour.addCountry (Antigua_Barbuda);

        Country Anguilla = new Country ((double)18.220554 , (double)-63.068615);
        ManageTour.addCountry (Anguilla);

        Country Albania = new Country ((double)41.153332 , (double)20.168331);
        ManageTour.addCountry (Albania);

        Country Armenia = new Country ((double)40.069099 , (double)45.038189);
        ManageTour.addCountry (Armenia);

        Country Netherlands_Antilles = new Country ((double)12.226079 , (double)-69.060087);
        ManageTour.addCountry (Netherlands_Antilles);

        Country Angola = new Country ((double)-11.202692 , (double)17.873887);
        ManageTour.addCountry (Angola);

        Country Antarctica = new Country ((double)-75.250973 , (double)-0.071389);
        ManageTour.addCountry (Antarctica);

        Country Argentina = new Country ((double)-38.416097 , (double)-63.616672);
        ManageTour.addCountry (Argentina);

        Country American_Samoa = new Country ((double)-14.270972 , (double)-170.132217);
        ManageTour.addCountry (American_Samoa);

        Country Austria = new Country ((double)47.516231 , (double)14.550072);
        ManageTour.addCountry (Austria);

        Country Australia = new Country ((double)-25.274398 , (double)133.775136);
        ManageTour.addCountry (Australia);

        Country Aruba = new Country ((double)12.52111 , (double)-69.968338);
        ManageTour.addCountry (Aruba);

        Country Azerbaijan = new Country ((double)40.143105 , (double)47.576927);
        ManageTour.addCountry (Azerbaijan);

        Country Bosnia_Herzegovina = new Country ((double)43.915886 , (double)17.679076);
        ManageTour.addCountry (Bosnia_Herzegovina);

        Country Barbados = new Country ((double)13.193887 , (double)-59.543198);
        ManageTour.addCountry (Barbados);

        Country Bangladesh = new Country ((double)23.684994 , (double)90.356331);
        ManageTour.addCountry (Bangladesh);

        Country Belgium = new Country ((double)50.503887 , (double)4.469936);
        ManageTour.addCountry (Belgium);

        Country Burkina_Faso = new Country ((double)12.238333 , (double)-1.561593);
        ManageTour.addCountry (Burkina_Faso);

        Country Bulgaria = new Country ((double)42.733883 , (double)25.48583);
        ManageTour.addCountry (Bulgaria);

        Country Bahrai = new Country ((double)25.930414 , (double)50.637772);
        ManageTour.addCountry (Bahrai);

        Country Buruni = new Country ((double)-3.373056 , (double)29.918886);
        ManageTour.addCountry (Buruni);

        Country Benin = new Country ((double)9.30769 , (double)2.315834);
        ManageTour.addCountry (Benin);

        Country Bermuda = new Country ((double)32.321384 , (double)-64.75737);
        ManageTour.addCountry (Bermuda);

        Country Brunei = new Country ((double)4.535277 , (double)114.727669);
        ManageTour.addCountry (Brunei);

        Country Bolivia = new Country ((double)-16.290154 , (double)-63.588653);
        ManageTour.addCountry (Bolivia);

        Country Brazil = new Country ((double)-14.235004 , (double)-51.92528);
        ManageTour.addCountry (Brazil);

        Country Bahamas = new Country ((double)25.03428 , (double)-77.39628);
        ManageTour.addCountry (Bahamas);

        Country Bhutan = new Country ((double)27.514162 , (double)90.433601);
        ManageTour.addCountry (Bhutan);

        Country Bouvet_Island = new Country ((double)-54.423199 , (double)3.413194);
        ManageTour.addCountry (Bouvet_Island);

        Country Botswana = new Country ((double)-22.328474 , (double)24.684866);
        ManageTour.addCountry (Botswana);

        Country Belarus = new Country ((double)53.709807 , (double)27.953389);
        ManageTour.addCountry (Belarus);

        Country Belize = new Country ((double)17.189877 , (double)-88.49765);
        ManageTour.addCountry (Belize);

        Country Canada = new Country ((double)56.130366 , (double)-106.346771);
        ManageTour.addCountry (Canada);

        Country Central_African_Republic = new Country ((double)6.611111 , (double)20.939444);
        ManageTour.addCountry (Central_African_Republic);


        Country Switzerland = new Country ((double)46.818188 , (double)8.227512);
        ManageTour.addCountry (Switzerland);


        Country Cook_Islands = new Country ((double)-21.236736 , (double)-159.777671);
        ManageTour.addCountry (Cook_Islands);

        Country Chile = new Country ((double)-35.675147 , (double)-71.542969);
        ManageTour.addCountry (Chile);

        Country Cameroon = new Country ((double)7.369722 , (double)12.354722);
        ManageTour.addCountry (Cameroon);

        Country China = new Country ((double)35.86166 , (double)104.195397);
        ManageTour.addCountry (China);

        Country Colombia = new Country ((double)4.570868 , (double)-74.297333);
        ManageTour.addCountry (Colombia);

        Country Costa_Rica = new Country ((double)9.748917 , (double)-83.753428);
        ManageTour.addCountry (Costa_Rica);

        Country Cuba = new Country ((double)21.521757 , (double)-77.781167);
        ManageTour.addCountry (Cuba);

        Country Cape_Verde = new Country ((double)16.002082 , (double)-24.013197);
        ManageTour.addCountry (Cape_Verde);

        Country Christmas_Island = new Country ((double)-10.447525 , (double)105.690449);
        ManageTour.addCountry (Christmas_Island);

        Country Cyprus = new Country ((double)35.126413 , (double)33.429859);
        ManageTour.addCountry (Cyprus);

        Country Czech_Republic = new Country ((double)49.817492 , (double)15.472962);
        ManageTour.addCountry (Czech_Republic);

        Country Germany = new Country ((double)51.165691 , (double)10.451526);
        ManageTour.addCountry (Germany);

        Country Djibouti = new Country ((double)11.825138 , (double)42.590275);
        ManageTour.addCountry (Djibouti);

        Country Denmark = new Country ((double)56.26392 , (double)9.501785);
        ManageTour.addCountry (Denmark);

        Country Dominica = new Country ((double)15.414999 , (double)-61.370976);
        ManageTour.addCountry (Dominica);

        Country Dominican_Republic = new Country ((double)18.735693 , (double)-70.162651);
        ManageTour.addCountry (Dominican_Republic);

        Country Algeria = new Country ((double)28.033886 , (double)1.659626);
        ManageTour.addCountry (Algeria);

        Country Ecuador = new Country ((double)-1.831239 , (double)-78.183406);
        ManageTour.addCountry (Ecuador);

        Country Estonia = new Country ((double)58.595272 , (double)25.013607);
        ManageTour.addCountry (Estonia);

        Country Egypt = new Country ((double)26.820553 , (double)30.802498);
        ManageTour.addCountry (Egypt);

        Country Western_Sahara = new Country ((double)24.215527 , (double)-12.885834);
        ManageTour.addCountry (Western_Sahara);

        Country Eritrea = new Country ((double)15.179384 , (double)39.782334);
        ManageTour.addCountry (Eritrea);

        Country Spain = new Country ((double)40.463667 , (double)-3.74922);
        ManageTour.addCountry (Spain);

        Country Ethiopia = new Country ((double)9.145 , (double)40.489673);
        ManageTour.addCountry (Ethiopia);

        Country Finland = new Country ((double)61.92411 , (double)25.748151);
        ManageTour.addCountry (Finland);

        Country Fiji = new Country ((double)-16.578193 , (double)179.414413);
        ManageTour.addCountry (Fiji);


        Country Micronesia = new Country ((double)7.425554 , (double)150.550812);
        ManageTour.addCountry (Micronesia);

        Country Faroe_Islands = new Country ((double)61.892635 , (double)-6.911806);
        ManageTour.addCountry (Faroe_Islands);

        Country France = new Country ((double)46.227638 , (double)2.213749);
        ManageTour.addCountry (France);

        Country Gabon = new Country ((double)-0.803689 , (double)11.609444);
        ManageTour.addCountry (Gabon);

        Country United_Kingdom = new Country ((double)55.378051 , (double)-3.435973);
        ManageTour.addCountry (United_Kingdom);

        Country Grenada = new Country ((double)12.262776 , (double)-61.604171);
        ManageTour.addCountry (Grenada);

        Country Georgia = new Country ((double)42.315407 , (double)43.356892);
        ManageTour.addCountry (Georgia);

        Country French_Guiana = new Country ((double)3.933889 , (double)-53.125782);
        ManageTour.addCountry (French_Guiana);

        Country Guernsey = new Country ((double)49.465691 , (double)-2.585278);
        ManageTour.addCountry (Guernsey);

        Country Ghana = new Country ((double)7.946527 , (double)-1.023194);
        ManageTour.addCountry (Ghana);

        Country Gibraltar = new Country ((double)36.137741 , (double)-5.345374);
        ManageTour.addCountry (Gibraltar);

        Country Greenland = new Country ((double)71.706936 , (double)-42.604303);
        ManageTour.addCountry (Greenland);

        Country Gambia = new Country ((double)13.443182 , (double)-15.310139);
        ManageTour.addCountry (Gambia);

        Country Guinea = new Country ((double)9.945587 , (double)-9.696645);
        ManageTour.addCountry (Guinea);

        Country Guadeloupe = new Country ((double)16.995971 , (double)-62.067641);
        ManageTour.addCountry (Guadeloupe);

        Country Equatorial_Guinea = new Country ((double)1.650801 , (double)10.267895);
        ManageTour.addCountry (Equatorial_Guinea);

        Country Greece = new Country ((double)39.074208 , (double)21.824312);
        ManageTour.addCountry (Greece);

        Country South_Georgia_the_South_Sandwich_Islands = new Country ((double)-54.429579 , (double)-36.587909);
        ManageTour.addCountry (South_Georgia_the_South_Sandwich_Islands);

        Country Guatemala = new Country ((double)15.783471 , (double)-90.230759);
        ManageTour.addCountry (Guatemala);

        Country Guam = new Country ((double)13.444304 , (double)144.793731);
        ManageTour.addCountry (Guam);


        Country Guyana = new Country ((double)4.860416 , (double)-58.93018);
        ManageTour.addCountry (Guyana);

        Country Gaza_Strip = new Country ((double)31.354676 , (double)34.308825);
        ManageTour.addCountry (Gaza_Strip);

        Country Hong_Kong = new Country ((double)22.396428 , (double)114.109497);
        ManageTour.addCountry (Hong_Kong);

        Country Heard_Island_McDonald_Islands = new Country ((double)-53.08181 , (double)73.504158);
        ManageTour.addCountry (Heard_Island_McDonald_Islands);

        Country Honduras = new Country ((double)15.199999 , (double)-86.241905);
        ManageTour.addCountry (Honduras);

        Country Croatia = new Country ((double)45.1 , (double)15.2);
        ManageTour.addCountry (Croatia);

        Country Haiti = new Country ((double)18.971187 , (double)-72.285215);
        ManageTour.addCountry (Haiti);

        Country Hungary = new Country ((double)47.162494 , (double)19.503304);
        ManageTour.addCountry (Hungary);

        Country Indonesia = new Country ((double)-0.789275 , (double)113.921327);
        ManageTour.addCountry (Indonesia);

        Country Ireland = new Country ((double)53.41291 , (double)-8.24389);
        ManageTour.addCountry (Ireland);

        Country Israel = new Country ((double)31.046051 , (double)34.851612);
        ManageTour.addCountry (Israel);

        Country Isle_of_Man = new Country ((double)54.236107 , (double)-4.548056);
        ManageTour.addCountry (Isle_of_Man);

        Country India = new Country ((double)20.593684 , (double)78.96288);
        ManageTour.addCountry (India);

        Country British_Indian_Ocean_Territory = new Country ((double)-6.343194 , (double)71.876519);
        ManageTour.addCountry (British_Indian_Ocean_Territory);

        Country Iraq = new Country ((double)33.223191 , (double)43.679291);
        ManageTour.addCountry (Iraq);

        Country Iran = new Country ((double)32.427908 , (double)53.688046);
        ManageTour.addCountry (Iran);

        Country Iceland = new Country ((double)64.963051 , (double)-19.020835);
        ManageTour.addCountry (Iceland);

        Country Italy = new Country ((double)41.87194 , (double)12.56738);
        ManageTour.addCountry (Italy);

        Country Jersey = new Country ((double)49.214439 , (double)-2.13125);
        ManageTour.addCountry (Jersey);

        Country Jamaica = new Country ((double)18.109581 , (double)-77.297508);
        ManageTour.addCountry (Jamaica);

        Country Jordan = new Country ((double)30.585164 , (double)36.238414);
        ManageTour.addCountry (Jordan);

        Country Japan = new Country ((double)36.204824 , (double)138.252924);
        ManageTour.addCountry (Japan);

        Country Kenya = new Country ((double)-0.023559 , (double)37.906193);
        ManageTour.addCountry (Kenya);

        Country Kyrgyzstan = new Country ((double)41.20438 , (double)74.766098);
        ManageTour.addCountry (Kyrgyzstan);

        Country Cambodia = new Country ((double)12.565679 , (double)104.990963);
        ManageTour.addCountry (Cambodia);

        Country Kiribati = new Country ((double)-3.370417 , (double)-168.734039);
        ManageTour.addCountry (Kiribati);

        Country Comoros = new Country ((double)-11.875001 , (double)43.872219);
        ManageTour.addCountry (Comoros);

        Country Saint_Kitts_Nevis = new Country ((double)17.357822 , (double)-62.782998);
        ManageTour.addCountry (Saint_Kitts_Nevis);

        Country North_Korea = new Country ((double)40.339852 , (double)127.510093);
        ManageTour.addCountry (North_Korea);

        Country South_Korea = new Country ((double)35.907757 , (double)127.766922);
        ManageTour.addCountry (South_Korea);

        Country Kuwait = new Country ((double)29.31166 , (double)47.481766);
        ManageTour.addCountry (Kuwait);

        Country Cayman_Islands = new Country ((double)19.513469 , (double)-80.566956);
        ManageTour.addCountry (Cayman_Islands);

        Country Kazakhstan = new Country ((double)48.019573 , (double)66.923684);
        ManageTour.addCountry (Kazakhstan);

        Country Laos = new Country ((double)19.85627 , (double)102.495496);
        ManageTour.addCountry (Laos);

        Country Lebanon = new Country ((double)33.854721 , (double)35.862285);
        ManageTour.addCountry (Lebanon);

        Country Saint_Lucia = new Country ((double)13.909444 , (double)-60.978893);
        ManageTour.addCountry (Saint_Lucia);

        Country Liechtenstein = new Country ((double)47.166 , (double)9.555373);
        ManageTour.addCountry (Liechtenstein);

        Country Sri_Lanka = new Country ((double)7.873054 , (double)80.771797);
        ManageTour.addCountry (Sri_Lanka);

        Country Liberia = new Country ((double)6.428055 , (double)-9.429499);
        ManageTour.addCountry (Liberia);

        Country Lesotho = new Country ((double)-29.609988 , (double)28.233608);
        ManageTour.addCountry (Lesotho);

        Country Lithuania = new Country ((double)55.169438 , (double)23.881275);
        ManageTour.addCountry (Lithuania);

        Country Luxembourg = new Country ((double)49.815273 , (double)6.129583);
        ManageTour.addCountry (Luxembourg);

        Country Latvia = new Country ((double)56.879635 , (double)24.603189);
        ManageTour.addCountry (Latvia);

        Country Libya = new Country ((double)26.3351 , (double)17.228331);
        ManageTour.addCountry (Libya);

        Country Morocco = new Country ((double)31.791702 , (double)-7.09262);
        ManageTour.addCountry (Morocco);

        Country Monaco = new Country ((double)43.750298 , (double)7.412841);
        ManageTour.addCountry (Monaco);

        Country Moldova = new Country ((double)47.411631 , (double)28.369885);
        ManageTour.addCountry (Moldova);

        Country Montenegro = new Country ((double)42.708678 , (double)19.37439);
        ManageTour.addCountry (Montenegro);

        Country Madagascar = new Country ((double)-18.766947 , (double)46.869107);
        ManageTour.addCountry (Madagascar);

        Country Marshall_Islands = new Country ((double)7.131474 , (double)171.184478);
        ManageTour.addCountry (Marshall_Islands);

        Country Mali = new Country ((double)17.570692 , (double)-3.996166);
        ManageTour.addCountry (Mali);

        Country Mongolia = new Country ((double)46.862496 , (double)103.846656);
        ManageTour.addCountry (Mongolia);

        Country Macau = new Country ((double)22.198745 , (double)113.543873);
        ManageTour.addCountry (Macau);

        Country Northern_Mariana_Islands = new Country ((double)17.33083 , (double)145.38469);
        ManageTour.addCountry (Northern_Mariana_Islands);

        Country Martinique = new Country ((double)14.641528 , (double)-61.024174);
        ManageTour.addCountry (Martinique);

        Country Mauritania = new Country ((double)21.00789 , (double)-10.940835);
        ManageTour.addCountry (Mauritania);

        Country Montserrat = new Country ((double)16.742498 , (double)-62.187366);
        ManageTour.addCountry (Montserrat);

        Country Malta = new Country ((double)35.937496 , (double)14.375416);
        ManageTour.addCountry (Malta);

        Country Mauritius = new Country ((double)-20.348404 , (double)57.552152);
        ManageTour.addCountry (Mauritius);

        Country Maldives = new Country ((double)3.202778 , (double)73.22068);
        ManageTour.addCountry (Maldives);

        Country Malawi = new Country ((double)-13.254308 , (double)34.301525);
        ManageTour.addCountry (Malawi);

        Country Mexico = new Country ((double)23.634501 , (double)-102.552784);
        ManageTour.addCountry (Mexico);

        Country Malaysia = new Country ((double)4.210484 , (double)101.975766);
        ManageTour.addCountry (Malaysia);

        Country Mozambique = new Country ((double)-18.665695 , (double)35.529562);
        ManageTour.addCountry (Mozambique);

        Country Namibia = new Country ((double)-22.95764 , (double)18.49041);
        ManageTour.addCountry (Namibia);

        Country New_Caledonia = new Country ((double)-20.904305 , (double)165.618042);
        ManageTour.addCountry (New_Caledonia);

        Country Niger = new Country ((double)17.607789 , (double)8.081666);
        ManageTour.addCountry (Niger);

        Country Norfolk_Island = new Country ((double)-29.040835 , (double)167.954712);
        ManageTour.addCountry (Norfolk_Island);

        Country Nigeria = new Country ((double)9.081999 , (double)8.675277);
        ManageTour.addCountry (Nigeria);

        Country Nicaragua = new Country ((double)12.865416 , (double)-85.207229);
        ManageTour.addCountry (Nicaragua);

        Country Netherlands = new Country ((double)52.132633 , (double)5.291266);
        ManageTour.addCountry (Netherlands);

        Country Norway = new Country ((double)60.472024 , (double)8.468946);
        ManageTour.addCountry (Norway);

        Country Nepal = new Country ((double)28.394857 , (double)84.124008);
        ManageTour.addCountry (Nepal);

        Country Nauru = new Country ((double)-0.522778 , (double)166.931503);
        ManageTour.addCountry (Nauru);

        Country Niue = new Country ((double)-19.054445 , (double)-169.867233);
        ManageTour.addCountry (Niue);

        Country New_Zealand = new Country ((double)-40.900557 , (double)174.885971);
        ManageTour.addCountry (New_Zealand);

        Country Oman = new Country ((double)21.512583 , (double)55.923255);
        ManageTour.addCountry (Oman);

        Country Panama = new Country ((double)8.537981 , (double)-80.782127);
        ManageTour.addCountry (Panama);

        Country Peru = new Country ((double)-9.189967 , (double)-75.015152);
        ManageTour.addCountry (Peru);

        Country French_Polynesia = new Country ((double)-17.679742 , (double)-149.406843);
        ManageTour.addCountry (French_Polynesia);

        Country Papua_New_Guinea = new Country ((double)-6.314993 , (double)143.95555);
        ManageTour.addCountry (Papua_New_Guinea);

        Country Philippines = new Country ((double)12.879721 , (double)121.774017);
        ManageTour.addCountry (Philippines);

        Country Pakistan = new Country ((double)30.375321 , (double)69.345116);
        ManageTour.addCountry (Pakistan);

        Country Poland = new Country ((double)51.919438 , (double)19.145136);
        ManageTour.addCountry (Poland);

        Country Saint_Pierre_Miquelon = new Country ((double)46.941936 , (double)-56.27111);
        ManageTour.addCountry (Saint_Pierre_Miquelon);

        Country Pitcairn_Islands = new Country ((double)-24.703615 , (double)-127.439308);
        ManageTour.addCountry (Pitcairn_Islands);

        Country Puerto_Rico = new Country ((double)18.220833 , (double)-66.590149);
        ManageTour.addCountry (Puerto_Rico);

        Country Palestinian_Territories = new Country ((double)31.952162 , (double)35.233154);
        ManageTour.addCountry (Palestinian_Territories);

        Country Portugal = new Country ((double)39.399872 , (double)-8.224454);
        ManageTour.addCountry (Portugal);

        Country Palau = new Country ((double)7.51498 , (double)134.58252);
        ManageTour.addCountry (Palau);

        Country Paraguay = new Country ((double)-23.442503 , (double)-58.443832);
        ManageTour.addCountry (Paraguay);

        Country Qatar = new Country ((double)25.354826 , (double)51.183884);
        ManageTour.addCountry (Qatar);

        Country Reunion = new Country ((double)-21.115141 , (double)55.536384);
        ManageTour.addCountry (Reunion);

        Country Romania = new Country ((double)45.943161 , (double)24.96676);
        ManageTour.addCountry (Romania);

        Country Serbia = new Country ((double)44.016521 , (double)21.005859);
        ManageTour.addCountry (Serbia);

        Country Russia = new Country ((double)61.52401 , (double)105.318756);
        ManageTour.addCountry (Russia);

        Country Rwanda = new Country ((double)-1.940278 , (double)29.873888);
        ManageTour.addCountry (Rwanda);

        Country Saudi_Arabia = new Country ((double)23.885942 , (double)45.079162);
        ManageTour.addCountry (Saudi_Arabia);

        Country Solomon_Islands = new Country ((double)-9.64571 , (double)160.156194);
        ManageTour.addCountry (Solomon_Islands);

        Country Seychelles = new Country ((double)-4.679574 , (double)55.491977);
        ManageTour.addCountry (Seychelles);

        Country Sudan = new Country ((double)12.862807 , (double)30.217636);
        ManageTour.addCountry (Sudan);

        Country Sweden = new Country ((double)60.128161 , (double)18.643501);
        ManageTour.addCountry (Sweden);

        Country Singapore = new Country ((double)1.352083 , (double)103.819836);
        ManageTour.addCountry (Singapore);

        Country Saint_Helena = new Country ((double)-24.143474 , (double)-10.030696);
        ManageTour.addCountry (Saint_Helena);

        Country Slovenia = new Country ((double)46.151241 , (double)14.995463);
        ManageTour.addCountry (Slovenia);

        Country Svalbard_Jan_Mayen = new Country ((double)77.553604 , (double)23.670272);
        ManageTour.addCountry (Svalbard_Jan_Mayen);

        Country Slovakia = new Country ((double)48.669026 , (double)19.699024);
        ManageTour.addCountry (Slovakia);

        Country Sierra_Leone = new Country ((double)8.460555 , (double)-11.779889);
        ManageTour.addCountry (Sierra_Leone);

        Country San_Marino = new Country ((double)43.94236 , (double)12.457777);
        ManageTour.addCountry (San_Marino);

        Country Senegal = new Country ((double)14.497401 , (double)-14.452362);
        ManageTour.addCountry (Senegal);

        Country Somalia = new Country ((double)5.152149 , (double)46.199616);
        ManageTour.addCountry (Somalia);

        Country Suriname = new Country ((double)3.919305 , (double)-56.027783);
        ManageTour.addCountry (Suriname);

        Country Sao_Tome_Principe = new Country ((double)0.18636 , (double)6.613081);
        ManageTour.addCountry (Sao_Tome_Principe);

        Country El_Salvador = new Country ((double)13.794185 , (double)-88.89653);
        ManageTour.addCountry (El_Salvador);

        Country Syria = new Country ((double)34.802075 , (double)38.996815);
        ManageTour.addCountry (Syria);

        Country Swaziland = new Country ((double)-26.522503 , (double)31.465866);
        ManageTour.addCountry (Swaziland);

        Country Turks_Caicos_Islands = new Country ((double)21.694025 , (double)-71.797928);
        ManageTour.addCountry (Turks_Caicos_Islands);

        Country Chad = new Country ((double)15.454166 , (double)18.732207);
        ManageTour.addCountry (Chad);

        Country French_Southern_Territories = new Country ((double)-49.280366 , (double)69.348557);
        ManageTour.addCountry (French_Southern_Territories);

        Country Togo = new Country ((double)8.619543 , (double)0.824782);
        ManageTour.addCountry (Togo);

        Country Thailand = new Country ((double)15.870032 , (double)100.992541);
        ManageTour.addCountry (Thailand);

        Country Tajikistan = new Country ((double)38.861034 , (double)71.276093);
        ManageTour.addCountry (Tajikistan);

        Country Tokelau = new Country ((double)-8.967363 , (double)-171.855881);
        ManageTour.addCountry (Tokelau);

        Country Turkmenistan = new Country ((double)38.969719 , (double)59.556278);
        ManageTour.addCountry (Turkmenistan);

        Country Tunisia = new Country ((double)33.886917 , (double)9.537499);
        ManageTour.addCountry (Tunisia);

        Country Tonga = new Country ((double)-21.178986 , (double)-175.198242);
        ManageTour.addCountry (Tonga);

        Country Turkey = new Country ((double)38.963745 , (double)35.243322);
        ManageTour.addCountry (Turkey);

        Country Trinidad_Tobago = new Country ((double)10.691803 , (double)-61.222503);
        ManageTour.addCountry (Trinidad_Tobago);

        Country Tuvalu = new Country ((double)-7.109535 , (double)177.64933);
        ManageTour.addCountry (Tuvalu);

        Country Taiwan = new Country ((double)23.69781 , (double)120.960515);
        ManageTour.addCountry (Taiwan);

        Country Tanzania = new Country ((double)-6.369028 , (double)34.888822);
        ManageTour.addCountry (Tanzania);

        Country Ukraine = new Country ((double)48.379433 , (double)31.16558);
        ManageTour.addCountry (Ukraine);

        Country Uganda = new Country ((double)1.373333 , (double)32.290275);
        ManageTour.addCountry (Uganda);

        Country United_States = new Country ((double)37.09024 , (double)-95.712891);
        ManageTour.addCountry (United_States);

        Country Uruguay = new Country ((double)-32.522779 , (double)-55.765835);
        ManageTour.addCountry (Uruguay);

        Country Uzbekistan = new Country ((double)41.377491 , (double)64.585262);
        ManageTour.addCountry (Uzbekistan);

        Country Vatican_Country = new Country ((double)41.902916 , (double)12.453389);
        ManageTour.addCountry (Vatican_Country);

        Country Saint_Vincent_the_Grenadines = new Country ((double)12.984305 , (double)-61.287228);
        ManageTour.addCountry (Saint_Vincent_the_Grenadines);

        Country Venezuela = new Country ((double)6.42375 , (double)-66.58973);
        ManageTour.addCountry (Venezuela);

        Country British_Virgin_Islands = new Country ((double)18.420695 , (double)-64.639968);
        ManageTour.addCountry (British_Virgin_Islands);


        Country Vietnam = new Country ((double)14.058324 , (double)108.277199);
        ManageTour.addCountry (Vietnam);

        Country Vanuatu = new Country ((double)-15.376706 , (double)166.959158);
        ManageTour.addCountry (Vanuatu);

        Country Wallis_Futuna = new Country ((double)-13.768752 , (double)-177.156097);
        ManageTour.addCountry (Wallis_Futuna);

        Country Samoa = new Country ((double)-13.759029 , (double)-172.104629);
        ManageTour.addCountry (Samoa);

        Country Kosovo = new Country ((double)42.602636 , (double)20.902977);
        ManageTour.addCountry (Kosovo);

        Country Yemen = new Country ((double)15.552727 , (double)48.516388);
        ManageTour.addCountry (Yemen);

        Country Mayotte = new Country ((double)-12.8275 , (double)45.166244);
        ManageTour.addCountry (Mayotte);

        Country South_Africa = new Country ((double)-30.559482 , (double)22.937506);
        ManageTour.addCountry (South_Africa);

        Country Zambia = new Country ((double)-13.133897 , (double)27.849332);
        ManageTour.addCountry (Zambia);

        Country Zimbabwe = new Country ((double)-19.015438 , (double)29.154857);
        ManageTour.addCountry (Zimbabwe);

        System.out.println("No. of countries : " + ManageTour.no_Countries());

        Population pop = new Population(236, true);

        double sum =0;
        for(double k=1; k<=100 ; k++)
        {

            System.out.println("k = " + (int)k);
            pop = Genetic_Algo.evolvePopulation(pop);
            for (double i = 0; i < 235; i++)
            {
                pop = Genetic_Algo.evolvePopulation(pop);
            }

            double f = pop.getFittest().getDistance();
            sum = sum + f;
            System.out.println("Distance: " + f);
            System.out.println("Path acc. to Genetic_Algo : ");
            System.out.println(pop.getFittest());
            System.out.println("");
        }
    }
}
