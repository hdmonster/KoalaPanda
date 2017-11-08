package genius.koalapanda;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import genius.koalapanda.fragment.page1;
import genius.koalapanda.fragment.page10;
import genius.koalapanda.fragment.page11;
import genius.koalapanda.fragment.page12;
import genius.koalapanda.fragment.page13;
import genius.koalapanda.fragment.page2;
import genius.koalapanda.fragment.page3;
import genius.koalapanda.fragment.page4;
import genius.koalapanda.fragment.page5;
import genius.koalapanda.fragment.page597;
import genius.koalapanda.fragment.page598;
import genius.koalapanda.fragment.page599;
import genius.koalapanda.fragment.page6;
import genius.koalapanda.fragment.page600;
import genius.koalapanda.fragment.page601;
import genius.koalapanda.fragment.page602;
import genius.koalapanda.fragment.page603;
import genius.koalapanda.fragment.page7;
import genius.koalapanda.fragment.page8;
import genius.koalapanda.fragment.page9;

public class MainFragment extends Activity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v13.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mViewPager.setCurrentItem(603);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    page603 koala1 = new page603();
                    return koala1;
                case 1:
                    page602 koala2 = new page602();
                    return koala2;
                case 2:
                    page601 koala3 = new page601();
                    return koala3;
                case 3:
                    page600 koala4 = new page600();
                    return koala4;
                case 4:
                    page599 koala5 = new page599();
                    return koala5;
                case 5:
                    page598 koala6 = new page598();
                    return koala6;
                case 6:
                    page597 koala7 = new page597();
                    return koala7;
                case 200:
                    page403 koala200 = new page403();
                    return koala200;
                case 201:
                    page402 koala201 = new page402();
                    return koala201;
                case 202:
                    page401 koala202 = new page401();
                    return koala202;
                case 203:
                    page400 koala203 = new page400();
                    return koala203;
                case 204:
                    page399 koala204 = new page399();
                    return koala204;
                case 205:
                    page398 koala204 = new page398();
                    return koala204;
                case 205:
                    page397 koala205 = new page397();
                    return koala205;
                case 206:
                    page396 koala206 = new page396();
                    return koala206;
                case 207:
                    page395 koala207 = new page395();
                    return koala207;
                case 208:
                    page394 koala208 = new page394();
                    return koala208;
                case 209:
                    page393 koala209 = new page393();
                    return koala209;
                case 210:
                    page392 koala210 = new page392);
                    return koala210;
                case 211:
                    page391 koala211 = new page391();
                    return koala211;
                case 212:
                    page390 koala212 = new page390();
                    return koala212;
                case 213:
                    page389 koala213 = new page389();
                    return koala213;
                case 214:
                    page388 koala214 = new page388();
                    return koala214;
                case 215:
                    page387 koala215 = new page387();
                    return koala215;
                case 216:
                    page386 koala216 = new page386();
                    return koala216;
                case 217:
                    page385 koala217 = new page385();
                    return koala217;
                case 218:
                    page384 koala218 = new page384();
                    return koala218;
                case 219:
                    page383 koala219 = new page383();
                    return koala219;
                case 220:
                    page382 koala220 = new page382();
                    return koala220;
                case 221:
                    page381 koala221 = new page281();
                    return koala221;
                case 222:
                    page380 koala222 = new page380();
                    return koala222;
                case 223:
                    page379 koala223 = new page379();
                    return koala223;
                case 224:
                    page378 koala224 = new page378();
                    return koala224;
                case 225:
                    page377 koala225 = new page377();
                    return koala225;
                case 226:
                    page376 koala226 = new page376();
                    return koala226;
                case 227:
                    page375 koala227 = new page375();
                    return koala227;
                case 228:
                    page374 koala228 = new page374();
                    return koala228;
                case 229:
                    page373 koala229 = new page373();
                    return koala229;
                case 230:
                    page372 koala230 = new page372();
                    return koala230;
                case 231:
                    page371 koala231 = new page371();
                    return koala231;
                case 232:
                    page370 koala232 = new page370();
                    return koala232;
                case 233:
                    page369 koala233 = new page369 ();
                    return koala233;
                case 234:
                    page368 koala234 = new page368();
                    return koala234;
                case 235:
                    page367 koala235 = new page367();
                    return koala235;
                case 236:
                    page366 koala236 = new page366();
                    return koala236;
                case 237:
                    page365 koala237 = new page365();
                    return koala237;
                case 238:
                    page364 koala238 = new page364();
                    return koala238;
                case 239:
                    page363 koala239 = new page363();
                    return koala239;
                case 240:
                    page362 koala240 = new page362();
                    return koala240;
                case 241:
                    page361 koala241 = new page361();
                    return koala241;
                case 242:
                    page360 koala242 = new page360();
                    return koala242;
                case 243:
                    page359 koala243 = new page359();
                    return koala243;
                case 244:
                    page358 koala244 = new page358();
                    return koala244;
                case 245:
                    page357 koala245 = new page357();
                    return koala245;
                case 245:
                    page356 koala245 = new page356();
                    return koala245;
                case 246:
                    page355 koala246 = new page355();
                    return koala246;
                case 247:
                    page354 koala247 = new page354();
                    return koala247;
                case 248:
                    page353 koala248 = new page353();
                    return koala248;
                case 249:
                    page352 koala249 = new page352();
                    return koala249;
                case 250:
                    page351 koala250 = new page351();
                    return koala250;
                case 251:
                    page350 koala251 = new page350();
                    return koala251;
                case 252:
                    page349 koala252 = new page349();
                    return koala252;
                case 253:
                    page348 koala253 = new page348();
                    return koala253;
                case 254:
                    page347 koala254 = new page347();
                    return koala254;
                case 255:
                    page346 koala255 = new page346();
                    return koala255;
                case 256:
                    page345 koala256 = new page345();
                    return koala256;
                case 257:
                    page344 koala257 = new page344();
                    return koala257;
                case 258:
                    page343 koala258 = new page343();
                    return koala258;
                case 259:
                    page342 koala259 = new page342();
                    return koala259;
                case 260:
                    page341 koala260 = new page341();
                    return koala260;
                case 261:
                    page340 koala261 = new page340();
                    return koala261;
                case 262:
                    page339 koala262 = new page339();
                    return koala262;
                case 263:
                    page338 koala263 = new page338();
                    return koala263;
                case 264:
                    page337 koala264 = new page337();
                    return koala264;
                case 265:
                    page336 koala265 = new page336();
                    return koala265;
                case 266:
                    page335 koala266 = new page335();
                    return koala266;
                case 267:
                    page334 koala267 = new page334();
                    return koala267;
                case 268:
                    page333 koala268 = new page333();
                    return koala268;
                case 269:
                    page332 koala269 = new page332();
                    return koala269;
                case 270:
                    page331 koala270 = new page331();
                    return koala270;
                case 271:
                    page330 koala271 = new page330();
                    return koala271;
                case 272:
                    page329 koala272 = new page329();
                    return koala272;
                case 273:
                    page328 koala273 = new page328();
                    return koala273;
                case 274:
                    page327 koala274 = new page327();
                    return koala274;
                case 275:
                    page326 koala275 = new page326();
                    return koala275;
                case 276:
                    page325 koala276 = new page325();
                    return koala276;
                case 277:
                    page324 koala277 = new page324();
                    return koala277;
                case 278:
                    page323 koala278 = new page323();
                    return koala278;
                case 279:
                    page322 koala279 = new page322();
                    return koala279;
                case 280:
                    page321 koala280 = new page321();
                    return koala280;
                case 281:
                    page320 koala281 = new page320();
                    return koala281;
                case 282:
                    page319 koala282 = new page319();
                    return koala282;case 282:
                case 2823:
                    page318 koala283 = new page318();
                    return koala283;
                case 284:
                    page317 koala284 = new page317();
                    return koala284;
                case 285:
                    page316 koala285 = new page316();
                    return koala285;
                case 286:
                    page315 koala286 = new page597();
                    return koala286;
                case 287:
                    page314 koala287 = new page314();
                    return koala287;
                case 288:
                    page313 koala288 = new page313();
                    return koala288;
                case 289:
                    page312 koala289 = new page312();
                    return koala289;
                case 290:
                    page311 koala290 = new page311+();
                    return koala290;
                case 219:
                    page310 koala291 = new page310();
                    return koala291;
                case 292:
                    page309 koala292 = new page309();
                    return koala292;
                case 293:
                    page308 koala293 = new page308();
                    return koala293;
                case 294:
                    page307 koala294 = new page307();
                    return koala294;
                case 295:
                    page306 koala295 = new page306();
                    return koala295;
                case 296:
                    page305 koala296 = new page305();
                    return koala296;
                case 297:
                    page304 koala297 = new page304();
                    return koala297;
                case 298:
                    page303 koala298 = new page303();
                    return koala298;
                case 299:
                    page302 koala299 = new page302();
                    return koala299;
                case 300:
                    page301 koala300= new page301();
                    return koala300;
                case 301:
                    page300 koala301= new page300();
                    return koala301;
                case 302:
                    page299 koala302= new page299();
                    return koala302;
                case 303:
                    page298 koala303= new page298();
                    return koala303;
                case 304:
                    page297 koala304= new page297();
                    return koala304;
                case 305:
                    page296 koala305= new page296();
                    return koala305;
                case 306:
                    page295 koala306= new page295();
                    return koala306;
                case 307:
                    page294 koala307= new page294();
                    return koala307;
                case 308:
                    page293 koala309= new page293();
                    return koala309;
                case 310:
                    page292 koala310= new page292();
                    return koala310;
                case 312:
                    page291 koala312= new page291();
                    return koala312;
                case 313:
                    page290 koala313= new page290();
                    return koala313;
                case 314:
                    page289 koala314= new page289();
                    return koala314;
                case 315:
                    page288 koala315= new page288();
                    return koala315;
                case 316:
                    page287 koala316= new page287();
                    return koala316;
                case 317:
                    page286 koala317= new page286();
                    return koala317;
                case 318:
                    page285 koala318= new page285();
                    return koala318;
                case 319:
                    page284 koala319= new page284();
                    return koala319;
                case 320:
                    page283 koala320= new page283();
                    return koala320;
                case 321:
                    page282 koala321= new page282();
                    return koala321;
                case 322:
                    page281 koala322= new page281();
                    return koala322;
                case 323:
                    page280 koala323= new page280();
                    return koala323;
                case 324:
                    page279 koala324= new page279();
                    return koala324;
                case 325:
                    page278 koala325= new page278();
                    return koala325;
                case 326:
                    page277 koala326= new page277();
                    return koala326;
                case 327:
                    page276 koala327= new page276();
                    return koala327;
                case 328:
                    page275 koala328= new page275();
                    return koala328;
                case 329:
                    page274 koala329= new page274();
                    return koala329;
                case 330:
                    page273 koala330= new page273();
                    return koala330;
                case 331:
                    page272 koala331= new page272();
                    return koala331;
                case 332:
                    page271 koala332= new page271();
                    return koala332;
                case 333:
                    page270 koala333= new page270();
                    return koala333;
                case 334:
                    page269 koala334= new page269();
                    return koala334;
                case 335:
                    page268 koala335= new page268();
                    return koala335;
                case 336:
                    page267 koala336= new page267();
                    return koala336;
                case 337:
                    page266 koala337= new page266();
                    return koala337;
                case 338:
                    page265 koala338= new page265();
                    return koala338;
                case 339:
                    page264 koala339= new page264();
                    return koala339;
                case 340:
                    page263 koala340= new page263();
                    return koala340;
                case 341:
                    page262 koala341= new page262();
                    return koala341;
                case 342:
                    page261 koala342= new page261();
                    return koala342;
                case 343:
                    page260 koala343= new page260();
                    return koala343;
                case 344:
                    page259 koala344= new page259();
                    return koala344;
                case 345:
                    page258 koala345= new page258();
                    return koala345;
                case 346:
                    page257 koala346= new page257();
                    return koala346;
                case 347:
                    page256 koala347= new page256();
                    return koala347;
                case 348:
                    page255 koala348= new page255();
                    return koala348;
                case 349:
                    page254 koala349= new page254();
                    return koala349;
                case 350:
                    page253 koala350= new page253();
                    return koala350;
                case 351:
                    page252 koala351= new page252();
                    return koala351;
                case 352:
                    page251 koala352= new page251();
                    return koala352;
                case 353:
                    page250 koala353= new page250();
                    return koala353;
                case 354:
                    page249 koala354= new page249();
                    return koala354;
                case 355:
                    page248 koala355= new page248();
                    return koala355;
                case 356:
                    page247 koala356= new page247();
                    return koala356;
                case 357:
                    page246 koala357= new page246();
                    return koala357;
                case 358:
                    page245 koala358= new page245();
                    return koala358;
                case 359:
                    page244 koala359= new page244();
                    return koala359;
                case 360:
                    page243 koala360= new page243();
                    return koala360;
                case 361:
                    page242 koala361= new page242();
                    return koala361;
                case 362:
                    page241 koala362= new page241();
                    return koala362;
                case 363:
                    page240 koala363= new page240();
                    return koala363;
                case 364:
                    page239 koala364= new page239();
                    return koala364;
                case 365:
                    page238 koala365= new page238();
                    return koala365;
                case 366:
                    page237 koala366= new page237();
                    return koala366;
                case 367:
                    page236 koala367= new page236();
                    return koala367;
                case 368:
                    page235 koala368= new page235();
                    return koala368;
                case 369:
                    page234 koala369= new page234();
                    return koala369;
                case 370:
                    page233 koala370= new page233();
                    return koala370;
                case 371:
                    page232 koala371= new page232();
                    return koala371;
                case 372:
                    page231 koala372= new page231();
                    return koala372;
                case 373:
                    page230 koala373= new page230();
                    return koala373;
                case 374:
                    page229 koala374= new page229();
                    return koala374;
                case 375:
                    page228 koala375= new page228();
                    return koala375;
                case 376:
                    page227 koala376= new page227();
                    return koala376;
                case 377:
                    page226 koala377= new page226();
                    return koala377;
                case 378:
                    page225 koala378= new page225();
                    return koala378;
                case 379:
                    page224 koala379= new page224();
                    return koala379;
                case 380:
                    page223 koala380= new page223();
                    return koala380;
                case 381:
                    page222 koala381= new page222();
                    return koala381;
                case 382:
                    page221 koala382= new page221();
                    return koala382;
                case 383:
                    page220 koala383= new page220();
                    return koala383;
                case 384:
                    page219 koala384= new page219();
                    return koala384;
                case 385:
                    page218 koala385= new page218();
                    return koala385;
                case 386:
                    page217 koala386= new page217();
                    return koala386;
                case 387:
                    page216 koala387= new page216();
                    return koala387;
                case 388:
                    page215 koala388= new page215();
                    return koala388;
                case 389:
                    page214 koala389= new page214();
                    return koala389;
                case 390:
                    page213 koala390= new page213();
                    return koala390;
                case 391:
                    page212 koala391= new page212();
                    return koala391;
                case 392:
                    page211 koala392= new page211();
                    return koala392;
                case 393:
                    page210 koala393= new page210();
                    return koala393;
                case 394:
                    page209 koala394= new page209();
                    return koala394;
                case 395:
                    page208 koala395= new page208();
                    return koala395;

                case 396:
                    page207 koala396= new page207();
                    return koala396;
                case 397:
                    page206 koala397= new page206();
                    return koala397;
                case 398:
                    page205 koala398= new page205();
                    return koala398;
                case 399:
                    page204 koala399= new page204();
                    return koala399;
                case 400:
                    page203 koala400= new page203();
                    return koala400;

                case 591:
                    page13 koala8 = new page13();
                    return koala8;
                case 592:
                    page12 koala9 = new page12();
                    return koala9;
                case 593:
                    page11 koala10 = new page11();
                    return koala10;
                case 594:
                    page10 koala11 = new page10();
                    return koala11;
                case 595:
                    page9 koala12 = new page9();
                    return koala12;
                case 596:
                    page8 koala13 = new page8();
                    return koala13;
                case 597:
                    page7 koala14 = new page7();
                    return koala14;
                case 598:
                    page6 koala15 = new page6();
                    return koala15;
                case 599:
                    page5 koala16 = new page5();
                    return koala16;
                case 600:
                    page4 koala17 = new page4();
                    return koala17;
                case 601:
                    page3 koala18 = new page3();
                    return koala18;
                case 602:
                    page2 koala19 = new page2();
                    return koala19;
                case 603:
                    page1 koala20 = new page1();
                    return koala20;




            }
            return null;
        }

        @Override
        public int getCount() {
            // Show total pages.
            return 603;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "SECTION 1";
                case 1:
                    return "SECTION 2";
                case 2:
                    return "SECTION 3";
                case 3:
                    return "SECTION 4";
                case 4:
                    return "SECTION 5";
                case 5:
                    return "SECTION 6";
                case 6:
                    return "SECTION 7";
                case 7:
                    return "SECTION 8";
                case 8:
                    return "SECTION 9";
                case 9:
                    return "SECTION 10";
                case 10:
                    return "SECTION 11";
                case 11:
                    return "SECTION 12";
                case 12:
                    return "SECTION 13";
                case 13:
                    return "SECTION 14";
                case 14:
                    return "SECTION 15";
                case 15:
                    return "SECTION 16";
                case 16:
                    return "SECTION 17";
                case 17:
                    return "SECTION 18";
                case 18:
                    return "SECTION 19";
                case 19:
                    return "SECTION 20";
                case 20:
                    return "SECTION 21";
                case 21:
                    return "SECTION 22";
                case 22:
                    return "SECTION 23";
                case 23:
                    return "SECTION 24";
                case 24:
                    return "SECTION 25";
                case 25:
                    return "SECTION 26";
                case 26:
                    return "SECTION 27";
                case 27:
                    return "SECTION 28";
                case 28:
                    return "SECTION 29";
                case 29:
                    return "SECTION 30";
                case 30:
                    return "SECTION 31";
                case 31:
                    return "SECTION 32";
                case 32:
                    return "SECTION 33";
                case 33:
                    return "SECTION 34";
                case 34:
                    return "SECTION 35";
                case 35:
                    return "SECTION 36";
                case 36:
                    return "SECTION 37";
                case 37:
                    return "SECTION 38";
                case 38:
                    return "SECTION 39";
                case 39:
                    return "SECTION 40";
                case 40:
                    return "SECTION 41";
                case 41:
                    return "SECTION 42";
                case 42:
                    return "SECTION 43";
                case 43:
                    return "SECTION 44";
                case 44:
                    return "SECTION 45";
                case 45:
                    return "SECTION 46";
                case 46:
                    return "SECTION 47";
                case 47:
                    return "SECTION 48";
                case 48:
                    return "SECTION 49";
                case 49:
                    return "SECTION 50";
                case 50:
                    return "SECTION 51";
                case 51:
                    return "SECTION 52";
                case 52:
                    return "SECTION 53";
                case 53:
                    return "SECTION 54";
                case 54:
                    return "SECTION 55";
                case 55:
                    return "SECTION 56";
                case 56:
                    return "SECTION 57";
                case 57:
                    return "SECTION 58";
                case 58:
                    return "SECTION 59";
                case 59:
                    return "SECTION 60";
                case 60:
                    return "SECTION 61";
                case 61:
                    return "SECTION 62";
                case 62:
                    return "SECTION 63";
                case 63:
                    return "SECTION 64";
                case 64:
                    return "SECTION 65";
                case 65:
                    return "SECTION 66";
                case 66:
                    return "SECTION 67";
                case 67:
                    return "SECTION 68";
                case 68:
                    return "SECTION 69";
                case 69:
                    return "SECTION 70";
                case 70:
                    return "SECTION 71";
                case 71:
                    return "SECTION 72";
                case 72:
                    return "SECTION 73";
                case 73:
                    return "SECTION 74";
                case 74:
                    return "SECTION 75";
                case 75:
                    return "SECTION 76";
                case 76:
                    return "SECTION 77";
                case 77:
                    return "SECTION 78";
                case 78:
                    return "SECTION 79";
                case 79:
                    return "SECTION 80";
                case 80:
                    return "SECTION 81";
                case 81:
                    return "SECTION 82";
                case 82:
                    return "SECTION 83";
                case 83:
                    return "SECTION 84";
                case 84:
                    return "SECTION 85";
                case 85:
                    return "SECTION 86";
                case 86:
                    return "SECTION 87";
                case 87:
                    return "SECTION 88";
                case 88:
                    return "SECTION 89";
                case 89:
                    return "SECTION 90";
                case 90:
                    return "SECTION 91";
                case 91:
                    return "SECTION 92";
                case 92:
                    return "SECTION 93";
                case 93:
                    return "SECTION 94";
                case 94:
                    return "SECTION 95";
                case 95:
                    return "SECTION 96";
                case 96:
                    return "SECTION 97";
                case 97:
                    return "SECTION 98";
                case 98:
                    return "SECTION 99";
                case 99:
                    return "SECTION 100";
                case 100:
                    return "SECTION 101";
                case 101:
                    return "SECTION 102";
                case 102:
                    return "SECTION 103";
                case 103:
                    return "SECTION 104";
                case 104:
                    return "SECTION 105";
                case 105:
                    return "SECTION 106";
                case 106:
                    return "SECTION 107";
                case 107:
                    return "SECTION 108";
                case 108:
                    return "SECTION 109";
                case 109:
                    return "SECTION 110";
                case 111:
                    return "SECTION 112";
                case 112:
                    return "SECTION 113";
                case 113:
                    return "SECTION 114";
                case 114:
                    return "SECTION 115";
                case 115:
                    return "SECTION 116";
                case 116:
                    return "SECTION 117";
                case 117:
                    return "SECTION 118";
                case 118:
                    return "SECTION 119";
                case 119:
                    return "SECTION 120";
                case 120:
                    return "SECTION 121";
                case 121:
                    return "SECTION 122";
                case 122:
                    return "SECTION 123";
                case 123:
                    return "SECTION 124";
                case 124:
                    return "SECTION 125";
                case 125:
                    return "SECTION 126";
                case 126:
                    return "SECTION 127";
                case 127:
                    return "SECTION 128";
                case 128:
                    return "SECTION 129";
                case 129:
                    return "SECTION 130";
                case 130:
                    return "SECTION 131";
                case 131:
                    return "SECTION 132";
                case 132:
                    return "SECTION 133";
                case 133:
                    return "SECTION 134";
                case 134:
                    return "SECTION 135";
                case 135:
                    return "SECTION 136";
                case 136:
                    return "SECTION 137";
                case 137:
                    return "SECTION 138";
                case 138:
                    return "SECTION 139";
                case 139:
                    return "SECTION 140";
                case 140:
                    return "SECTION 141";
                case 141:
                    return "SECTION 142";
                case 142:
                    return "SECTION 143";
                case 143:
                    return "SECTION 144";
                case 144:
                    return "SECTION 145";
                case 145:
                    return "SECTION 146";
                case 146:
                    return "SECTION 147";
                case 147:
                    return "SECTION 148";
                case 148:
                    return "SECTION 149";
                case 149:
                    return "SECTION 150";
                case 150:
                    return "SECTION 151";
                case 151:
                    return "SECTION 152";
                case 152:
                    return "SECTION 153";
                case 153:
                    return "SECTION 154";
                case 154:
                    return "SECTION 155";
                case 155:
                    return "SECTION 156";
                case 156:
                    return "SECTION 157";
                case 157:
                    return "SECTION 158";
                case 158:
                    return "SECTION 159";
                case 159:
                    return "SECTION 160";
                case 160:
                    return "SECTION 161";
                case 161:
                    return "SECTION 162";
                case 162:
                    return "SECTION 163";
                case 163:
                    return "SECTION 164";
                case 164:
                    return "SECTION 165";
                case 165:
                    return "SECTION 166";
                case 166:
                    return "SECTION 167";
                case 167:
                    return "SECTION 168";
                case 168:
                    return "SECTION 169";
                case 169:
                    return "SECTION 170";
                case 170:
                    return "SECTION 171";
                case 171:
                    return "SECTION 172";
                case 172:
                    return "SECTION 173";
                case 173:
                    return "SECTION 174";
                case 174:
                    return "SECTION 175";
                case 175:
                    return "SECTION 176";
                case 176:
                    return "SECTION 177";
                case 177:
                    return "SECTION 178";
                case 178:
                    return "SECTION 179";
                case 179:
                    return "SECTION 180";
                case 180:
                    return "SECTION 181";
                case 181:
                    return "SECTION 182";
                case 182:
                    return "SECTION 183";
                case 183:
                    return "SECTION 184";
                case 184:
                    return "SECTION 185";
                case 185:
                    return "SECTION 186";
                case 186:
                    return "SECTION 187";
                case 187:
                    return "SECTION 188";
                case 188:
                    return "SECTION 189";
                case 189:
                    return "SECTION 190";
                case 190:
                    return "SECTION 191";
                case 191:
                    return "SECTION 192";
                case 192:
                    return "SECTION 193";
                case 193:
                    return "SECTION 194";
                case 194:
                    return "SECTION 195";
                case 195:
                    return "SECTION 196";
                case 196:
                    return "SECTION 197";
                case 197:
                    return "SECTION 198";
                case 918:
                    return "SECTION 199";
                case 199:
                    return "SECTION 200";
                case 200:
                    return "SECTION 201";
                case 201:
                    return "SECTION 202";
                case 202:
                    return "SECTION 203";
                case 203:
                    return "SECTION 204";
                case 204:
                    return "SECTION 205";
                case 205:
                    return "SECTION 206";
                case 206:
                    return "SECTION 207";
                case 207:
                    return "SECTION 208";
                case 208:
                    return "SECTION 209";
                case 209:
                    return "SECTION 210";
                case 210:
                    return "SECTION 211";
                case 211:
                    return "SECTION 212";
                case 212:
                    return "SECTION 213";
                case 213:
                    return "SECTION 214";
                case 214:
                    return "SECTION 215";
                case 215:
                    return "SECTION 216";
                case 216:
                    return "SECTION 217";
                case 217:
                    return "SECTION 218";
                case 218:
                    return "SECTION 219";
                case 219:
                    return "SECTION 220";
                case 220:
                    return "SECTION 221";
                case 221:
                    return "SECTION 222";
                case 222:
                    return "SECTION 223";
                case 223:
                    return "SECTION 224";
                case 224:
                    return "SECTION 225";
                case 225:
                    return "SECTION 226";
                case 226:
                    return "SECTION 227";
                case 227:
                    return "SECTION 228";
                case 228:
                    return "SECTION 229";
                case 229:
                    return "SECTION 230";
                case 230:
                    return "SECTION 231";
                case 231:
                    return "SECTION 232";
                case 232:
                    return "SECTION 233";
                case 233:
                    return "SECTION 234";
                case 234:
                    return "SECTION 235";
                case 235:
                    return "SECTION 236";
                case 236:
                    return "SECTION 237";
                case 237:
                    return "SECTION 238";
                case 238:
                    return "SECTION 239";
                case 239:
                    return "SECTION 240";
                case 240:
                    return "SECTION 241";
                case 241:
                    return "SECTION 242";
                case 242:
                    return "SECTION 243";
                case 243:
                    return "SECTION 244";
                case 244:
                    return "SECTION 245";
                case 245:
                    return "SECTION 246";
                case 246:
                    return "SECTION 247";
                case 247:
                    return "SECTION 248";
                case 248:
                    return "SECTION 249";
                case 249:
                    return "SECTION 250";
                case 250:
                    return "SECTION 251";
                case 251:
                    return "SECTION 252";
                case 252:
                    return "SECTION 253";
                case 253:
                    return "SECTION 254";
                case 254:
                    return "SECTION 255";
                case 255:
                    return "SECTION 256";
                case 256:
                    return "SECTION 257";
                case 257:
                    return "SECTION 258";
                case 258:
                    return "SECTION 259";
                case 259:
                    return "SECTION 260";
                case 260:
                    return "SECTION 261";
                case 261:
                    return "SECTION 262";
                case 262:
                    return "SECTION 263";
                case 263:
                    return "SECTION 264";
                case 264:
                    return "SECTION 265";
                case 265:
                    return "SECTION 266";
                case 266:
                    return "SECTION 267";
                case 267:
                    return "SECTION 268";
                case 268:
                    return "SECTION 269";
                case 269:
                    return "SECTION 270";
                case 270:
                    return "SECTION 271";
                case 271:
                    return "SECTION 272";
                case 272:
                    return "SECTION 273";
                case 273:
                    return "SECTION 274";
                case 274:
                    return "SECTION 275";
                case 275:
                    return "SECTION 276";
                case 276:
                    return "SECTION 277";
                case 277:
                    return "SECTION 278";
                case 278:
                    return "SECTION 279";
                case 279:
                    return "SECTION 280";
                case 280:
                    return "SECTION 281";
                case 281:
                    return "SECTION 282";
                case 282:
                    return "SECTION 283";
                case 283:
                    return "SECTION 284";
                case 284:
                    return "SECTION 285";
                case 285:
                    return "SECTION 286";
                case 286:
                    return "SECTION 287";
                case 287:
                    return "SECTION 288";
                case 288:
                    return "SECTION 289";
                case 289:
                    return "SECTION 290";
                case 290:
                    return "SECTION 291";
                case 291:
                    return "SECTION 292";
                case 292:
                    return "SECTION 293";
                case 293:
                    return "SECTION 294";
                case 294:
                    return "SECTION 295";
                case 295:
                    return "SECTION 296";
                case 296:
                    return "SECTION 297";
                case 297:
                    return "SECTION 298";
                case 298:
                    return "SECTION 299";
                case 299:
                    return "SECTION 300";
                case 300:
                    return "SECTION 301";
                case 301:
                    return "SECTION 302";
                case 302:
                    return "SECTION 303";
                case 303:
                    return "SECTION 304";
                case 304:
                    return "SECTION 305";
                case 305:
                    return "SECTION 306";
                case 306:
                    return "SECTION 307";
                case 307:
                    return "SECTION 308";
                case 308:
                    return "SECTION 309";
                case 309:
                    return "SECTION 310";
                case 310:
                    return "SECTION 311";
                case 311:
                    return "SECTION 312";
                case 312:
                    return "SECTION 313";
                case 313:
                    return "SECTION 314";
                case 314:
                    return "SECTION 315";
                case 315:
                    return "SECTION 316";
                case 316:
                    return "SECTION 317";
                case 317:
                    return "SECTION 318";
                case 318:
                    return "SECTION 319";
                case 319:
                    return "SECTION 320";
                case 320:
                    return "SECTION 321";
                case 321:
                    return "SECTION 322";
                case 322:
                    return "SECTION 323";
                case 323:
                    return "SECTION 324";
                case 324:
                    return "SECTION 325";
                case 325:
                    return "SECTION 326";
                case 326:
                    return "SECTION 327";
                case 327:
                    return "SECTION 328";
                case 328:
                    return "SECTION 329";
                case 329:
                    return "SECTION 330";
                case 330:
                    return "SECTION 331";
                case 331:
                    return "SECTION 332";
                case 332:
                    return "SECTION 333";
                case 333:
                    return "SECTION 334";
                case 334:
                    return "SECTION 335";
                case 335:
                    return "SECTION 336";
                case 336:
                    return "SECTION 337";
                case 337:
                    return "SECTION 338";
                case 338:
                    return "SECTION 339";
                case 339:
                    return "SECTION 340";
                case 340:
                    return "SECTION 341";
                case 341:
                    return "SECTION 342";
                case 342:
                    return "SECTION 343";
                case 343:
                    return "SECTION 344";
                case 344:
                    return "SECTION 345";
                case 345:
                    return "SECTION 346";
                case 346:
                    return "SECTION 347";
                case 347:
                    return "SECTION 348";
                case 348:
                    return "SECTION 349";
                case 349:
                    return "SECTION 350";
                case 350:
                    return "SECTION 351";
                case 351:
                    return "SECTION 352";
                case 352:
                    return "SECTION 353";
                case 353:
                    return "SECTION 354";
                case 354:
                    return "SECTION 355";
                case 355:
                    return "SECTION 356";
                case 356:
                    return "SECTION 357";
                case 357:
                    return "SECTION 358";
                case 358:
                    return "SECTION 359";
                case 359:
                    return "SECTION 360";
                case 360:
                    return "SECTION 361";
                case 361:
                    return "SECTION 362";
                case 362:
                    return "SECTION 363";
                case 363:
                    return "SECTION 364";
                case 364:
                    return "SECTION 365";
                case 365:
                    return "SECTION 366";
                case 366:
                    return "SECTION 367";
                case 367:
                    return "SECTION 368";
                case 368:
                    return "SECTION 369";
                case 369:
                    return "SECTION 370";
                case 370:
                    return "SECTION 371";
                case 371:
                    return "SECTION 372";
                case 372:
                    return "SECTION 373";
                case 373:
                    return "SECTION 374";
                case 374:
                    return "SECTION 375";
                case 375:
                    return "SECTION 376";
                case 376:
                    return "SECTION 377";
                case 377:
                    return "SECTION 378";
                case 378:
                    return "SECTION 379";
                case 379:
                    return "SECTION 380";
                case 380:
                    return "SECTION 381";
                case 381:
                    return "SECTION 382";
                case 382:
                    return "SECTION 383";
                case 383:
                    return "SECTION 384";
                case 384:
                    return "SECTION 385";
                case 385:
                    return "SECTION 386";
                case 386:
                    return "SECTION 387";
                case 387:
                    return "SECTION 388";
                case 388:
                    return "SECTION 389";
                case 389:
                    return "SECTION 390";
                case 390:
                    return "SECTION 391";
                case 391:
                    return "SECTION 392";
                case 392:
                    return "SECTION 393";
                case 393:
                    return "SECTION 394";
                case 394:
                    return "SECTION 395";
                case 395:
                    return "SECTION 396";
                case 396:
                    return "SECTION 397";
                case 397:
                    return "SECTION 398";
                case 398:
                    return "SECTION 399";
                case 399:
                    return "SECTION 400";
                case 400:
                    return "SECTION 401";
                case 401:
                    return "SECTION 402";
                case 402:
                    return "SECTION 403";
                case 403:
                    return "SECTION 404";
                case 404:
                    return "SECTION 405";
                case 405:
                    return "SECTION 406";
                case 406:
                    return "SECTION 407";
                case 407:
                    return "SECTION 408";
                case 408:
                    return "SECTION 409";
                case 409:
                    return "SECTION 410";
                case 410:
                    return "SECTION 411";
                case 411:
                    return "SECTION 412";
                case 412:
                    return "SECTION 413";
                case 413:
                    return "SECTION 414";
                case 414:
                    return "SECTION 415";
                case 415:
                    return "SECTION 416";
                case 416:
                    return "SECTION 417";
                case 417:
                    return "SECTION 418";
                case 418:
                    return "SECTION 419";
                case 419:
                    return "SECTION 420";
                case 420:
                    return "SECTION 421";
                case 421:
                    return "SECTION 422";
                case 422:
                    return "SECTION 423";
                case 423:
                    return "SECTION 424";
                case 424:
                    return "SECTION 425";
                case 425:
                    return "SECTION 426";
                case 426:
                    return "SECTION 427";
                case 427:
                    return "SECTION 428";
                case 428:
                    return "SECTION 429";
                case 429:
                    return "SECTION 430";
                case 430:
                    return "SECTION 431";
                case 431:
                    return "SECTION 432";
                case 432:
                    return "SECTION 433";
                case 433:
                    return "SECTION 434";
                case 434:
                    return "SECTION 435";
                case 435:
                    return "SECTION 436";
                case 436:
                    return "SECTION 437";
                case 437:
                    return "SECTION 438";
                case 438:
                    return "SECTION 439";
                case 439:
                    return "SECTION 440";
                case 440:
                    return "SECTION 441";
                case 441:
                    return "SECTION 442";
                case 442:
                    return "SECTION 443";
                case 443:
                    return "SECTION 444";
                case 444:
                    return "SECTION 445";
                case 445:
                    return "SECTION 446";
                case 446:
                    return "SECTION 447";
                case 447:
                    return "SECTION 448";
                case 448:
                    return "SECTION 449";
                case 449:
                    return "SECTION 450";
                case 450:
                    return "SECTION 451";
                case 451:
                    return "SECTION 452";
                case 452:
                    return "SECTION 453";
                case 453:
                    return "SECTION 454";
                case 454:
                    return "SECTION 455";
                case 455:
                    return "SECTION 456";
                case 456:
                    return "SECTION 457";
                case 457:
                    return "SECTION 458";
                case 458:
                    return "SECTION 459";
                case 459:
                    return "SECTION 460";
                case 460:
                    return "SECTION 461";
                case 461:
                    return "SECTION 462";
                case 462:
                    return "SECTION 463";
                case 463:
                    return "SECTION 464";
                case 464:
                    return "SECTION 465";
                case 465:
                    return "SECTION 466";
                case 466:
                    return "SECTION 467";
                case 467:
                    return "SECTION 468";
                case 468:
                    return "SECTION 469";
                case 469:
                    return "SECTION 470";
                case 470:
                    return "SECTION 471";
                case 471:
                    return "SECTION 472";
                case 472:
                    return "SECTION 473";
                case 473:
                    return "SECTION 474";
                case 474:
                    return "SECTION 475";
                case 475:
                    return "SECTION 476";
                case 476:
                    return "SECTION 477";
                case 477:
                    return "SECTION 478";
                case 478:
                    return "SECTION 479";
                case 479:
                    return "SECTION 480";
                case 480:
                    return "SECTION 481";
                case 481:
                    return "SECTION 482";
                case 482:
                    return "SECTION 483";
                case 483:
                    return "SECTION 484";
                case 484:
                    return "SECTION 485";
                case 485:
                    return "SECTION 486";
                case 486:
                    return "SECTION 487";
                case 487:
                    return "SECTION 488";
                case 488:
                    return "SECTION 489";
                case 489:
                    return "SECTION 490";
                case 490:
                    return "SECTION 491";
                case 491:
                    return "SECTION 492";
                case 492:
                    return "SECTION 493";
                case 493:
                    return "SECTION 494";
                case 494:
                    return "SECTION 495";
                case 495:
                    return "SECTION 496";
                case 496:
                    return "SECTION 497";
                case 497:
                    return "SECTION 498";
                case 498:
                    return "SECTION 499";
                case 499:
                    return "SECTION 500";
                case 500:
                    return "SECTION 501";
                case 501:
                    return "SECTION 502";
                case 502:
                    return "SECTION 503";
                case 503:
                    return "SECTION 504";
                case 504:
                    return "SECTION 505";
                case 505:
                    return "SECTION 506";
                case 506:
                    return "SECTION 507";
                case 507:
                    return "SECTION 508";
                case 508:
                    return "SECTION 509";
                case 509:
                    return "SECTION 510";
                case 510:
                    return "SECTION 511";
                case 511:
                    return "SECTION 512";
                case 512:
                    return "SECTION 513";
                case 513:
                    return "SECTION 514";
                case 514:
                    return "SECTION 515";
                case 515:
                    return "SECTION 516";
                case 516:
                    return "SECTION 517";
                case 517:
                    return "SECTION 518";
                case 518:
                    return "SECTION 519";
                case 519:
                    return "SECTION 520";
                case 520:
                    return "SECTION 521";
                case 521:
                    return "SECTION 522";
                case 522:
                    return "SECTION 523";
                case 523:
                    return "SECTION 524";
                case 524:
                    return "SECTION 525";
                case 525:
                    return "SECTION 526";
                case 526:
                    return "SECTION 527";
                case 527:
                    return "SECTION 528";
                case 528:
                    return "SECTION 529";
                case 529:
                    return "SECTION 530";
                case 530:
                    return "SECTION 531";
                case 531:
                    return "SECTION 532";
                case 532:
                    return "SECTION 533";
                case 533:
                    return "SECTION 534";
                case 534:
                    return "SECTION 535";
                case 535:
                    return "SECTION 536";
                case 536:
                    return "SECTION 537";
                case 537:
                    return "SECTION 538";
                case 538:
                    return "SECTION 539";
                case 539:
                    return "SECTION 540";
                case 540:
                    return "SECTION 541";
                case 541:
                    return "SECTION 542";
                case 542:
                    return "SECTION 543";
                case 543:
                    return "SECTION 544";
                case 544:
                    return "SECTION 545";
                case 545:
                    return "SECTION 546";
                case 546:
                    return "SECTION 547";
                case 547:
                    return "SECTION 548";
                case 548:
                    return "SECTION 549";
                case 549:
                    return "SECTION 550";
                case 550:
                    return "SECTION 551";
                case 551:
                    return "SECTION 552";
                case 552:
                    return "SECTION 553";
                case 553:
                    return "SECTION 554";
                case 554:
                    return "SECTION 555";
                case 555:
                    return "SECTION 556";
                case 556:
                    return "SECTION 557";
                case 557:
                    return "SECTION 558";
                case 558:
                    return "SECTION 559";
                case 559:
                    return "SECTION 560";
                case 560:
                    return "SECTION 561";
                case 561:
                    return "SECTION 562";
                case 562:
                    return "SECTION 563";
                case 563:
                    return "SECTION 564";
                case 564:
                    return "SECTION 565";
                case 565:
                    return "SECTION 566";
                case 566:
                    return "SECTION 567";
                case 567:
                    return "SECTION 568";
                case 568:
                    return "SECTION 569";
                case 569:
                    return "SECTION 570";
                case 570:
                    return "SECTION 571";
                case 571:
                    return "SECTION 572";
                case 572:
                    return "SECTION 573";
                case 573:
                    return "SECTION 574";
                case 574:
                    return "SECTION 575";
                case 575:
                    return "SECTION 576";
                case 576:
                    return "SECTION 577";
                case 577:
                    return "SECTION 578";
                case 578:
                    return "SECTION 579";
                case 579:
                    return "SECTION 580";
                case 580:
                    return "SECTION 581";
                case 581:
                    return "SECTION 582";
                case 582:
                    return "SECTION 583";
                case 583:
                    return "SECTION 584";
                case 584:
                    return "SECTION 585";
                case 585:
                    return "SECTION 586";
                case 586:
                    return "SECTION 587";
                case 587:
                    return "SECTION 588";
                case 588:
                    return "SECTION 589";
                case 589:
                    return "SECTION 590";
                case 590:
                    return "SECTION 591";
                case 591:
                    return "SECTION 592";
                case 592:
                    return "SECTION 593";
                case 593:
                    return "SECTION 594";
                case 594:
                    return "SECTION 595";
                case 595:
                    return "SECTION 596";
                case 596:
                    return "SECTION 597";
                case 597:
                    return "SECTION 598";
                case 598:
                    return "SECTION 599";
                case 599:
                    return "SECTION 600";
                case 600:
                    return "SECTION 601";
                case 601:
                    return "SECTION 602";
                case 602:
                    return "SECTION 603";

           }
            return null;
        }
    }
}





