package com.bytedance.adsdk.LD;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import com.badlogic.gdx.Input;
import com.bytedance.adsdk.LD.JXs.eK;
import com.bytedance.component.sdk.annotation.RawRes;
import com.bytedance.component.sdk.annotation.WorkerThread;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public class OY {
    private static final Map<String, NXR<ebl>> Lxb = new HashMap();
    private static final Set<Object> LD = new HashSet();
    private static final byte[] lk = {80, 75, 3, 4};

    public static NXR<ebl> LD(Context context, String str) {
        return LD(context, str, "asset_".concat(String.valueOf(str)));
    }

    @WorkerThread
    public static sLN<ebl> lk(Context context, String str) {
        return lk(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static NXR<ebl> LD(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return Lxb(str2, new Callable<sLN<ebl>>() { // from class: com.bytedance.adsdk.LD.OY.4
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public sLN<ebl> call() throws Exception {
                return OY.lk(applicationContext, str, str2);
            }
        });
    }

    public static NXR<ebl> Lxb(Context context, String str) {
        return Lxb(context, str, "url_".concat(String.valueOf(str)));
    }

    @WorkerThread
    public static sLN<ebl> lk(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return LD(context.getAssets().open(str), str2);
            }
            return Lxb(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new sLN<>((Throwable) e);
        }
    }

    public static NXR<ebl> Lxb(final Context context, final String str, final String str2) {
        return Lxb(str2, new Callable<sLN<ebl>>() { // from class: com.bytedance.adsdk.LD.OY.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public sLN<ebl> call() throws Exception {
                sLN<ebl> slnLxb = JXs.Lxb(context).Lxb(context, str, str2);
                if (str2 != null && slnLxb.Lxb() != null) {
                    com.bytedance.adsdk.LD.lk.JXs.Lxb().Lxb(str2, slnLxb.Lxb());
                }
                return slnLxb;
            }
        });
    }

    @WorkerThread
    public static sLN<ebl> LD(Context context, @RawRes int i) {
        return LD(context, i, lk(context, i));
    }

    public static NXR<ebl> Lxb(Context context, @RawRes int i) {
        return Lxb(context, i, lk(context, i));
    }

    @WorkerThread
    public static sLN<ebl> LD(Context context, @RawRes int i, String str) {
        try {
            return LD(context.getResources().openRawResource(i), lk(context, i));
        } catch (Resources.NotFoundException e) {
            return new sLN<>((Throwable) e);
        }
    }

    public static NXR<ebl> Lxb(Context context, @RawRes final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return Lxb(str, new Callable<sLN<ebl>>() { // from class: com.bytedance.adsdk.LD.OY.5
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public sLN<ebl> call() throws Exception {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return OY.LD(context2, i, str);
            }
        });
    }

    private static String lk(Context context, @RawRes int i) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append(Lxb(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    @WorkerThread
    public static sLN<ebl> LD(InputStream inputStream, String str) {
        return Lxb(inputStream, str, true);
    }

    @WorkerThread
    private static sLN<ebl> LD(Context context, ZipInputStream zipInputStream, String str) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            ebl eblVarLxb = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    eblVarLxb = Lxb(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).Lxb();
                } else if (!name.endsWith(".png") && !name.endsWith(".webp") && !name.endsWith(".jpg") && !name.endsWith(".jpeg")) {
                    if (!name.endsWith(".ttf") && !name.endsWith(".otf")) {
                        zipInputStream.closeEntry();
                    } else if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        String[] strArrSplit = name.split("/");
                        String str2 = strArrSplit[strArrSplit.length - 1];
                        String str3 = str2.split("\\.")[0];
                        File file = new File(context.getCacheDir(), str2);
                        new FileOutputStream(file);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i = zipInputStream.read(bArr);
                                    if (i == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i);
                                }
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th3) {
                                        th.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            file.getAbsolutePath();
                        }
                        map2.put(str3, typefaceCreateFromFile);
                    }
                } else if (name.contains("../")) {
                    zipInputStream.closeEntry();
                    nextEntry = zipInputStream.getNextEntry();
                } else {
                    String[] strArrSplit2 = name.split("/");
                    map.put(strArrSplit2[strArrSplit2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (eblVarLxb == null) {
                return new sLN<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                nBu nbuLxb = Lxb(eblVarLxb, (String) entry.getKey());
                if (nbuLxb != null) {
                    nbuLxb.Lxb(com.bytedance.adsdk.LD.lc.lc.Lxb((Bitmap) entry.getValue(), nbuLxb.Lxb(), nbuLxb.LD()));
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean z = false;
                for (com.bytedance.adsdk.LD.lk.lk lkVar : eblVarLxb.IeN().values()) {
                    if (lkVar.Lxb().equals(entry2.getKey())) {
                        lkVar.Lxb((Typeface) entry2.getValue());
                        z = true;
                    }
                }
                if (!z) {
                }
            }
            if (map.isEmpty()) {
                Iterator<Map.Entry<String, nBu>> it = eblVarLxb.VVE().entrySet().iterator();
                while (it.hasNext()) {
                    nBu value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String strQAg = value.QAg();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = Input.Keys.NUMPAD_ENTER;
                    if (strQAg.startsWith("data:") && strQAg.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(strQAg.substring(strQAg.indexOf(44) + 1), 0);
                            value.Lxb(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                        } catch (IllegalArgumentException unused2) {
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, nBu> entry3 : eblVarLxb.VVE().entrySet()) {
                if (entry3.getValue().JVA() == null) {
                    return new sLN<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().QAg()));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.LD.lk.JXs.Lxb().Lxb(str, eblVarLxb);
            }
            return new sLN<>(eblVarLxb);
        } catch (IOException e) {
            return new sLN<>((Throwable) e);
        }
    }

    private static boolean Lxb(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static NXR<ebl> Lxb(final InputStream inputStream, final String str) {
        return Lxb(str, new Callable<sLN<ebl>>() { // from class: com.bytedance.adsdk.LD.OY.6
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public sLN<ebl> call() throws Exception {
                return OY.LD(inputStream, str);
            }
        });
    }

    @WorkerThread
    private static sLN<ebl> Lxb(InputStream inputStream, String str, boolean z) {
        try {
            return Lxb(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                com.bytedance.adsdk.LD.lc.lc.Lxb(inputStream);
            }
        }
    }

    @WorkerThread
    public static sLN<ebl> Lxb(JsonReader jsonReader, String str) {
        return Lxb(jsonReader, str, true);
    }

    private static sLN<ebl> Lxb(JsonReader jsonReader, String str, boolean z) {
        try {
            ebl eblVarLxb = eK.Lxb(jsonReader);
            com.bytedance.adsdk.LD.lk.JXs.Lxb().Lxb(str, eblVarLxb);
            return new sLN<>(eblVarLxb);
        } catch (Exception e) {
            return new sLN<>((Throwable) e);
        } finally {
            if (z) {
                Lxb(jsonReader);
            }
        }
    }

    public static void Lxb(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    @WorkerThread
    public static sLN<ebl> Lxb(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return LD(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.LD.lc.lc.Lxb(zipInputStream);
        }
    }

    private static nBu Lxb(ebl eblVar, String str) {
        for (nBu nbu : eblVar.VVE().values()) {
            if (nbu.QAg().equals(str)) {
                return nbu;
            }
        }
        return null;
    }

    private static NXR<ebl> Lxb(final String str, Callable<sLN<ebl>> callable) {
        final ebl eblVarLxb = str == null ? null : com.bytedance.adsdk.LD.lk.JXs.Lxb().Lxb(str);
        if (eblVarLxb != null) {
            return new NXR<>(new Callable<sLN<ebl>>() { // from class: com.bytedance.adsdk.LD.OY.7
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
                public sLN<ebl> call() throws Exception {
                    return new sLN<>(eblVarLxb);
                }
            });
        }
        if (str != null) {
            Map<String, NXR<ebl>> map = Lxb;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        NXR<ebl> nxr = new NXR<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            nxr.Lxb(new JVA<ebl>() { // from class: com.bytedance.adsdk.LD.OY.2
                @Override // com.bytedance.adsdk.LD.JVA
                public void Lxb(ebl eblVar) {
                    OY.Lxb.remove(str);
                    atomicBoolean.set(true);
                    if (OY.Lxb.size() == 0) {
                        OY.LD(true);
                    }
                }
            });
            nxr.lk(new JVA<Throwable>() { // from class: com.bytedance.adsdk.LD.OY.3
                @Override // com.bytedance.adsdk.LD.JVA
                public void Lxb(Throwable th) {
                    OY.Lxb.remove(str);
                    atomicBoolean.set(true);
                    if (OY.Lxb.size() == 0) {
                        OY.LD(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, NXR<ebl>> map2 = Lxb;
                map2.put(str, nxr);
                if (map2.size() == 1) {
                    LD(false);
                }
            }
        }
        return nxr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void LD(boolean z) {
        ArrayList arrayList = new ArrayList(LD);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
    }
}
