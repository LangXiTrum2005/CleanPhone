package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: LottieCompositionFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class polloi {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Map<String, walach<impromptu>> f16173attabal = new HashMap();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Set<peridotite> f16175saneness = new HashSet();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final byte[] f16174dern = {80, 75, 3, 4};

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final byte[] f16176wireman = {31, -117, 8};

    public static starveling<impromptu> adultoid(JsonReader jsonReader, String str, boolean z) {
        return dovishness(jsonReader, str, z);
    }

    public static seminary apical(impromptu impromptuVar, String str) {
        for (seminary seminaryVar : impromptuVar.cutely().values()) {
            if (seminaryVar.dern().equals(str)) {
                return seminaryVar;
            }
        }
        return null;
    }

    public static starveling<impromptu> arytenoidectomy(Context context, InputStream inputStream, String str) {
        impromptu impromptuVarAttabal = str == null ? null : lamplit.beachfront.saneness().attabal(str);
        if (impromptuVarAttabal != null) {
            return new starveling<>(impromptuVarAttabal);
        }
        try {
            duvetyn.beachfront beachfrontVarWireman = duvetyn.adultoid.wireman(duvetyn.adultoid.apical(inputStream));
            if (polder(beachfrontVarWireman).booleanValue()) {
                return sealless(context, new ZipInputStream(beachfrontVarWireman.inputStream()), str);
            }
            return restrictive(beachfrontVarWireman).booleanValue() ? polloi(new GZIPInputStream(beachfrontVarWireman.inputStream()), str) : graveside(JsonReader.kattegat(beachfrontVarWireman), str);
        } catch (IOException e) {
            return new starveling<>((Throwable) e);
        }
    }

    public static starveling<impromptu> cord(Context context, int i) {
        return cuirassed(context, i, saran(context, i));
    }

    public static starveling<impromptu> cuirassed(Context context, int i, String str) {
        impromptu impromptuVarAttabal = str == null ? null : lamplit.beachfront.saneness().attabal(str);
        if (impromptuVarAttabal != null) {
            return new starveling<>(impromptuVarAttabal);
        }
        try {
            duvetyn.beachfront beachfrontVarWireman = duvetyn.adultoid.wireman(duvetyn.adultoid.apical(context.getResources().openRawResource(i)));
            if (polder(beachfrontVarWireman).booleanValue()) {
                return sealless(context, new ZipInputStream(beachfrontVarWireman.inputStream()), str);
            }
            if (!restrictive(beachfrontVarWireman).booleanValue()) {
                return graveside(JsonReader.kattegat(beachfrontVarWireman), str);
            }
            try {
                return polloi(new GZIPInputStream(beachfrontVarWireman.inputStream()), str);
            } catch (IOException e) {
                return new starveling<>((Throwable) e);
            }
        } catch (Resources.NotFoundException e2) {
            return new starveling<>((Throwable) e2);
        }
    }

    public static walach<impromptu> cutely(final String str, Callable<starveling<impromptu>> callable, Runnable runnable) {
        impromptu impromptuVarAttabal = str == null ? null : lamplit.beachfront.saneness().attabal(str);
        walach<impromptu> walachVar = impromptuVarAttabal != null ? new walach<>(impromptuVarAttabal) : null;
        if (str != null) {
            Map<String, walach<impromptu>> map = f16173attabal;
            if (map.containsKey(str)) {
                walachVar = map.get(str);
            }
        }
        if (walachVar != null) {
            if (runnable != null) {
                runnable.run();
            }
            return walachVar;
        }
        walach<impromptu> walachVar2 = new walach<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            walachVar2.wireman(new grimness() { // from class: com.airbnb.lottie.kowloon
                @Override // com.airbnb.lottie.grimness
                public final void onResult(Object obj) {
                    polloi.taiyuan(str, atomicBoolean, (impromptu) obj);
                }
            });
            walachVar2.dern(new grimness() { // from class: com.airbnb.lottie.arytenoidectomy
                @Override // com.airbnb.lottie.grimness
                public final void onResult(Object obj) {
                    polloi.saneness(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, walach<impromptu>> map2 = f16173attabal;
                map2.put(str, walachVar2);
                if (map2.size() == 1) {
                    grimness(false);
                }
            }
        }
        return walachVar2;
    }

    public static /* synthetic */ starveling dern(Context context, String str, String str2) {
        starveling<impromptu> starvelingVarDern = wireman.cutely(context).dern(context, str, str2);
        if (str2 != null && starvelingVarDern.saneness() != null) {
            lamplit.beachfront.saneness().dern(str2, starvelingVarDern.saneness());
        }
        return starvelingVarDern;
    }

    public static starveling<impromptu> dovishness(JsonReader jsonReader, String str, boolean z) {
        try {
            impromptu impromptuVarAttabal = str == null ? null : lamplit.beachfront.saneness().attabal(str);
            if (impromptuVarAttabal != null) {
                return new starveling<>(impromptuVarAttabal);
            }
            impromptu impromptuVarAttabal2 = rotissomat.gintrap.attabal(jsonReader);
            if (str != null) {
                lamplit.beachfront.saneness().dern(str, impromptuVarAttabal2);
            }
            return new starveling<>(impromptuVarAttabal2);
        } catch (Exception e) {
            return new starveling<>((Throwable) e);
        } finally {
            if (z) {
                utwa.arytenoidectomy.dern(jsonReader);
            }
        }
    }

    public static walach<impromptu> formularize(Context context, String str) {
        return impassible(context, str, "asset_" + str);
    }

    public static starveling<impromptu> gintrap(duvetyn.supplicat supplicatVar, String str, boolean z) {
        return dovishness(JsonReader.kattegat(duvetyn.adultoid.wireman(supplicatVar)), str, z);
    }

    public static starveling<impromptu> graveside(JsonReader jsonReader, String str) {
        return adultoid(jsonReader, str, true);
    }

    public static void grimness(boolean z) {
        ArrayList arrayList = new ArrayList(f16175saneness);
        for (int i = 0; i < arrayList.size(); i++) {
            ((peridotite) arrayList.get(i)).attabal(z);
        }
    }

    public static walach<impromptu> impassible(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return cutely(str2, new Callable() { // from class: com.airbnb.lottie.triweekly
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return polloi.kowloon(applicationContext, str, str2);
            }
        }, null);
    }

    public static starveling<impromptu> kattegat(Context context, ZipInputStream zipInputStream, String str, boolean z) {
        try {
            return supplicat(context, zipInputStream, str);
        } finally {
            if (z) {
                utwa.arytenoidectomy.dern(zipInputStream);
            }
        }
    }

    public static starveling<impromptu> kowloon(Context context, String str, String str2) {
        impromptu impromptuVarAttabal = str2 == null ? null : lamplit.beachfront.saneness().attabal(str2);
        if (impromptuVarAttabal != null) {
            return new starveling<>(impromptuVarAttabal);
        }
        try {
            return arytenoidectomy(context, context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new starveling<>((Throwable) e);
        }
    }

    public static boolean merc(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static starveling<impromptu> molybdenite(InputStream inputStream, String str, boolean z) {
        return gintrap(duvetyn.adultoid.apical(inputStream), str, z);
    }

    public static walach<impromptu> monoploid(final InputStream inputStream, final String str) {
        return cutely(str, new Callable() { // from class: com.airbnb.lottie.cutely
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return polloi.polloi(inputStream, str);
            }
        }, new Runnable() { // from class: com.airbnb.lottie.apical
            @Override // java.lang.Runnable
            public final void run() {
                utwa.arytenoidectomy.dern(inputStream);
            }
        });
    }

    public static walach<impromptu> oilcan(final Context context, final ZipInputStream zipInputStream, final String str) {
        return cutely(str, new Callable() { // from class: com.airbnb.lottie.formularize
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return polloi.sealless(context, zipInputStream, str);
            }
        }, new Runnable() { // from class: com.airbnb.lottie.impassible
            @Override // java.lang.Runnable
            public final void run() {
                utwa.arytenoidectomy.dern(zipInputStream);
            }
        });
    }

    public static Boolean polder(duvetyn.beachfront beachfrontVar) {
        return seminary(beachfrontVar, f16174dern);
    }

    public static starveling<impromptu> polloi(InputStream inputStream, String str) {
        return molybdenite(inputStream, str, true);
    }

    public static walach<impromptu> preprohormone(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return cutely(str, new Callable() { // from class: com.airbnb.lottie.monoploid
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return polloi.wireman(weakReference, applicationContext, i, str);
            }
        }, null);
    }

    public static Boolean restrictive(duvetyn.beachfront beachfrontVar) {
        return seminary(beachfrontVar, f16176wireman);
    }

    public static walach<impromptu> rotuma(Context context, int i) {
        return preprohormone(context, i, saran(context, i));
    }

    public static /* synthetic */ void saneness(String str, AtomicBoolean atomicBoolean, Throwable th) {
        Map<String, walach<impromptu>> map = f16173attabal;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            grimness(true);
        }
    }

    public static String saran(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(merc(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    public static starveling<impromptu> sealless(Context context, ZipInputStream zipInputStream, String str) {
        return kattegat(context, zipInputStream, str, true);
    }

    public static Boolean seminary(duvetyn.beachfront beachfrontVar, byte[] bArr) {
        try {
            duvetyn.beachfront beachfrontVarPeek = beachfrontVar.peek();
            for (byte b : bArr) {
                if (beachfrontVarPeek.readByte() != b) {
                    return Boolean.FALSE;
                }
            }
            beachfrontVarPeek.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            utwa.beachfront.saneness("Failed to check zip file header", e);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static walach<impromptu> stratoscope(Context context, String str) {
        return trm(context, str, "url_" + str);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x014b A[Catch: IOException -> 0x02b0, TryCatch #4 {IOException -> 0x02b0, blocks: (B:7:0x0019, B:9:0x001f, B:12:0x0028, B:14:0x0034, B:75:0x017b, B:15:0x0039, B:17:0x0045, B:18:0x004a, B:20:0x0056, B:21:0x006f, B:24:0x0079, B:26:0x0081, B:28:0x0089, B:31:0x0093, B:33:0x009b, B:36:0x00a4, B:37:0x00a9, B:39:0x00bb, B:41:0x00dc, B:70:0x0141, B:72:0x014b, B:73:0x0168, B:69:0x0120, B:74:0x016c, B:5:0x000f, B:42:0x00e5, B:53:0x0106, B:68:0x011f, B:67:0x011c, B:64:0x0117, B:43:0x00ea, B:52:0x0103, B:63:0x0116, B:62:0x0113), top: B:131:0x000f, inners: #2 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x014b, please report this as an issue */
    public static starveling<impromptu> supplicat(Context context, ZipInputStream zipInputStream, String str) {
        impromptu impromptuVarAttabal;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            impromptuVarAttabal = null;
        } else {
            try {
                impromptuVarAttabal = lamplit.beachfront.saneness().attabal(str);
            } catch (IOException e) {
                return new starveling<>((Throwable) e);
            }
        }
        if (impromptuVarAttabal != null) {
            return new starveling<>(impromptuVarAttabal);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        impromptu impromptuVarSaneness = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                impromptuVarSaneness = dovishness(JsonReader.kattegat(duvetyn.adultoid.wireman(duvetyn.adultoid.apical(zipInputStream))), null, false).saneness();
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new starveling<>((Throwable) new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    utwa.beachfront.wireman("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th5);
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        utwa.beachfront.dern("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    map2.put(str3, typefaceCreateFromFile);
                    nextEntry = zipInputStream.getNextEntry();
                }
                Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                if (!file.delete()) {
                    utwa.beachfront.dern("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile2);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (impromptuVarSaneness == null) {
            return new starveling<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            seminary seminaryVarApical = apical(impromptuVarSaneness, (String) entry.getKey());
            if (seminaryVarApical != null) {
                seminaryVarApical.competently(utwa.arytenoidectomy.impassible((Bitmap) entry.getValue(), seminaryVarApical.beachfront(), seminaryVarApical.wireman()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (lamplit.saneness sanenessVar : impromptuVarSaneness.competently().values()) {
                if (sanenessVar.attabal().equals(entry2.getKey())) {
                    sanenessVar.marial((Typeface) entry2.getValue());
                    z = true;
                }
            }
            if (!z) {
                utwa.beachfront.dern("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator<Map.Entry<String, seminary>> it = impromptuVarSaneness.cutely().entrySet().iterator();
            while (it.hasNext()) {
                seminary value = it.next().getValue();
                if (value == null) {
                    return null;
                }
                String strDern = value.dern();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (strDern.startsWith("data:") && strDern.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(strDern.substring(strDern.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            value.competently(utwa.arytenoidectomy.impassible(bitmapDecodeByteArray, value.beachfront(), value.wireman()));
                        }
                    } catch (IllegalArgumentException e2) {
                        utwa.beachfront.wireman("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            lamplit.beachfront.saneness().dern(str, impromptuVarSaneness);
        }
        return new starveling<>(impromptuVarSaneness);
    }

    public static /* synthetic */ void taiyuan(String str, AtomicBoolean atomicBoolean, impromptu impromptuVar) {
        Map<String, walach<impromptu>> map = f16173attabal;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            grimness(true);
        }
    }

    public static starveling<impromptu> triweekly(Context context, String str) {
        return kowloon(context, str, "asset_" + str);
    }

    public static walach<impromptu> trm(final Context context, final String str, final String str2) {
        return cutely(str2, new Callable() { // from class: com.airbnb.lottie.taiyuan
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return polloi.dern(context, str, str2);
            }
        }, null);
    }

    public static /* synthetic */ starveling wireman(WeakReference weakReference, Context context, int i, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return cuirassed(context, i, str);
    }

    public static walach<impromptu> yemenite(ZipInputStream zipInputStream, String str) {
        return oilcan(null, zipInputStream, str);
    }
}
