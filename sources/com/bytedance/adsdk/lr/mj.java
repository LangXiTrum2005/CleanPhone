package com.bytedance.adsdk.lr;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import com.bytedance.adsdk.lr.fi.wjv;
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

/* JADX INFO: loaded from: classes2.dex */
public class mj {
    private static final Map<String, aw<xha>> ri = new HashMap();
    private static final Set<Object> lr = new HashSet();
    private static final byte[] ik = {80, 75, 3, 4};

    public static co<xha> ik(Context context, String str) {
        return ik(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static aw<xha> lr(Context context, String str) {
        return lr(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static co<xha> ik(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return lr(context.getAssets().open(str), str2);
            }
            return ri(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new co<>((Throwable) e);
        }
    }

    public static aw<xha> lr(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return ri(str2, new Callable<co<xha>>() { // from class: com.bytedance.adsdk.lr.mj.4
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public co<xha> call() throws Exception {
                return mj.ik(applicationContext, str, str2);
            }
        });
    }

    public static aw<xha> ri(Context context, String str) {
        return ri(context, str, "url_".concat(String.valueOf(str)));
    }

    public static aw<xha> ri(final Context context, final String str, final String str2) {
        return ri(str2, new Callable<co<xha>>() { // from class: com.bytedance.adsdk.lr.mj.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public co<xha> call() throws Exception {
                co<xha> coVarRi = fi.ri(context).ri(context, str, str2);
                if (str2 != null && coVarRi.ri() != null) {
                    com.bytedance.adsdk.lr.ik.fi.ri().ri(str2, coVarRi.ri());
                }
                return coVarRi;
            }
        });
    }

    public static co<xha> lr(Context context, int i) {
        return lr(context, i, ik(context, i));
    }

    public static aw<xha> ri(Context context, int i) {
        return ri(context, i, ik(context, i));
    }

    public static co<xha> lr(Context context, int i, String str) {
        try {
            return lr(context.getResources().openRawResource(i), ik(context, i));
        } catch (Resources.NotFoundException e) {
            return new co<>((Throwable) e);
        }
    }

    public static aw<xha> ri(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return ri(str, new Callable<co<xha>>() { // from class: com.bytedance.adsdk.lr.mj.5
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public co<xha> call() throws Exception {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return mj.lr(context2, i, str);
            }
        });
    }

    private static String ik(Context context, int i) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append(ri(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    public static co<xha> lr(InputStream inputStream, String str) {
        return ri(inputStream, str, true);
    }

    private static co<xha> lr(Context context, ZipInputStream zipInputStream, String str) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            xha xhaVarRi = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    xhaVarRi = ri(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).ri();
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
                                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                                if (!file.delete()) {
                                    file.getAbsolutePath();
                                }
                                map2.put(str3, typefaceCreateFromFile);
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
            if (xhaVarRi == null) {
                return new co<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                qt qtVarRi = ri(xhaVarRi, (String) entry.getKey());
                if (qtVarRi != null) {
                    qtVarRi.ri(com.bytedance.adsdk.lr.di.di.ri((Bitmap) entry.getValue(), qtVarRi.ri(), qtVarRi.lr()));
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean z = false;
                for (com.bytedance.adsdk.lr.ik.ik ikVar : xhaVarRi.vr().values()) {
                    if (ikVar.ri().equals(entry2.getKey())) {
                        ikVar.ri((Typeface) entry2.getValue());
                        z = true;
                    }
                }
                if (!z) {
                }
            }
            if (map.isEmpty()) {
                Iterator<Map.Entry<String, qt>> it = xhaVarRi.slm().entrySet().iterator();
                while (it.hasNext()) {
                    qt value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String strJbs = value.jbs();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (strJbs.startsWith("data:") && strJbs.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(strJbs.substring(strJbs.indexOf(44) + 1), 0);
                            value.ri(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                        } catch (IllegalArgumentException unused2) {
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, qt> entry3 : xhaVarRi.slm().entrySet()) {
                if (entry3.getValue().sf() == null) {
                    return new co<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().jbs()));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.lr.ik.fi.ri().ri(str, xhaVarRi);
            }
            return new co<>(xhaVarRi);
        } catch (IOException e) {
            return new co<>((Throwable) e);
        }
    }

    private static boolean ri(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static aw<xha> ri(final InputStream inputStream, final String str) {
        return ri(str, new Callable<co<xha>>() { // from class: com.bytedance.adsdk.lr.mj.6
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public co<xha> call() throws Exception {
                return mj.lr(inputStream, str);
            }
        });
    }

    private static co<xha> ri(InputStream inputStream, String str, boolean z) {
        try {
            return ri(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                com.bytedance.adsdk.lr.di.di.ri(inputStream);
            }
        }
    }

    public static co<xha> ri(JsonReader jsonReader, String str) {
        return ri(jsonReader, str, true);
    }

    private static co<xha> ri(JsonReader jsonReader, String str, boolean z) {
        try {
            xha xhaVarRi = wjv.ri(jsonReader);
            com.bytedance.adsdk.lr.ik.fi.ri().ri(str, xhaVarRi);
            return new co<>(xhaVarRi);
        } catch (Exception e) {
            return new co<>((Throwable) e);
        } finally {
            if (z) {
                ri(jsonReader);
            }
        }
    }

    public static void ri(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static co<xha> ri(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return lr(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.lr.di.di.ri(zipInputStream);
        }
    }

    private static qt ri(xha xhaVar, String str) {
        for (qt qtVar : xhaVar.slm().values()) {
            if (qtVar.jbs().equals(str)) {
                return qtVar;
            }
        }
        return null;
    }

    private static aw<xha> ri(final String str, Callable<co<xha>> callable) {
        final xha xhaVarRi = str == null ? null : com.bytedance.adsdk.lr.ik.fi.ri().ri(str);
        if (xhaVarRi != null) {
            return new aw<>(new Callable<co<xha>>() { // from class: com.bytedance.adsdk.lr.mj.7
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
                public co<xha> call() throws Exception {
                    return new co<>(xhaVarRi);
                }
            });
        }
        if (str != null) {
            Map<String, aw<xha>> map = ri;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        aw<xha> awVar = new aw<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            awVar.ri(new sf<xha>() { // from class: com.bytedance.adsdk.lr.mj.2
                @Override // com.bytedance.adsdk.lr.sf
                public void ri(xha xhaVar) {
                    mj.ri.remove(str);
                    atomicBoolean.set(true);
                    if (mj.ri.size() == 0) {
                        mj.lr(true);
                    }
                }
            });
            awVar.ik(new sf<Throwable>() { // from class: com.bytedance.adsdk.lr.mj.3
                @Override // com.bytedance.adsdk.lr.sf
                public void ri(Throwable th) {
                    mj.ri.remove(str);
                    atomicBoolean.set(true);
                    if (mj.ri.size() == 0) {
                        mj.lr(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, aw<xha>> map2 = ri;
                map2.put(str, awVar);
                if (map2.size() == 1) {
                    lr(false);
                }
            }
        }
        return awVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lr(boolean z) {
        ArrayList arrayList = new ArrayList(lr);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
    }
}
