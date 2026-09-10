package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.badlogic.gdx.Input;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class RJ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f3654a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final byte[] c = {80, 75, 3, 4};
    public static final byte[] d = {31, -117, 8};

    public static C3951lK a(final String str, Callable callable, RunnableC2928Zc runnableC2928Zc) {
        MJ mjA = str == null ? null : NJ.b.a(str);
        C3951lK c3951lK = mjA != null ? new C3951lK(mjA) : null;
        HashMap map = f3654a;
        if (str != null && map.containsKey(str)) {
            c3951lK = (C3951lK) map.get(str);
        }
        if (c3951lK != null) {
            if (runnableC2928Zc != null) {
                runnableC2928Zc.run();
            }
            return c3951lK;
        }
        final int i = 0;
        C3951lK c3951lK2 = new C3951lK(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            c3951lK2.b(new InterfaceC3513gK() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PJ
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3513gK
                public final void onResult(Object obj) {
                    int i2 = i;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (i2) {
                        case 0:
                            HashMap map2 = RJ.f3654a;
                            map2.remove(str2);
                            atomicBoolean2.set(true);
                            if (map2.size() == 0) {
                                RJ.i();
                            }
                            break;
                        default:
                            HashMap map3 = RJ.f3654a;
                            map3.remove(str2);
                            atomicBoolean2.set(true);
                            if (map3.size() == 0) {
                                RJ.i();
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            c3951lK2.a(new InterfaceC3513gK() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PJ
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3513gK
                public final void onResult(Object obj) {
                    int i3 = i2;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (i3) {
                        case 0:
                            HashMap map2 = RJ.f3654a;
                            map2.remove(str2);
                            atomicBoolean2.set(true);
                            if (map2.size() == 0) {
                                RJ.i();
                            }
                            break;
                        default:
                            HashMap map3 = RJ.f3654a;
                            map3.remove(str2);
                            atomicBoolean2.set(true);
                            if (map3.size() == 0) {
                                RJ.i();
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, c3951lK2);
                if (map.size() == 1) {
                    i();
                }
            }
        }
        return c3951lK2;
    }

    public static C3775jK b(Context context, String str, String str2) {
        MJ mjA = str2 == null ? null : NJ.b.a(str2);
        if (mjA != null) {
            return new C3775jK(mjA);
        }
        try {
            EX exF = AbstractC4496rb.f(AbstractC4496rb.x(context.getAssets().open(str)));
            if (h(exF, c).booleanValue()) {
                return f(context, new ZipInputStream(exF.Q()), str2);
            }
            if (h(exF, d).booleanValue()) {
                return c(new GZIPInputStream(exF.Q()), str2);
            }
            String[] strArr = MF.e;
            return d(new WF(exF), str2, true);
        } catch (IOException e) {
            return new C3775jK(e);
        }
    }

    public static C3775jK c(InputStream inputStream, String str) {
        EX exF = AbstractC4496rb.f(AbstractC4496rb.x(inputStream));
        String[] strArr = MF.e;
        return d(new WF(exF), str, true);
    }

    public static C3775jK d(WF wf, String str, boolean z) {
        try {
            MJ mjA = str == null ? null : NJ.b.a(str);
            if (mjA != null) {
                return new C3775jK(mjA);
            }
            MJ mjA2 = SJ.a(wf);
            if (str != null) {
                NJ.b.f3451a.put(str, mjA2);
            }
            return new C3775jK(mjA2);
        } catch (Exception e) {
            return new C3775jK(e);
        } finally {
            if (z) {
                AbstractC3014ah0.b(wf);
            }
        }
    }

    public static C3775jK e(Context context, int i, String str) {
        MJ mjA = str == null ? null : NJ.b.a(str);
        if (mjA != null) {
            return new C3775jK(mjA);
        }
        try {
            EX exF = AbstractC4496rb.f(AbstractC4496rb.x(context.getResources().openRawResource(i)));
            if (h(exF, c).booleanValue()) {
                return f(context, new ZipInputStream(exF.Q()), str);
            }
            if (!h(exF, d).booleanValue()) {
                String[] strArr = MF.e;
                return d(new WF(exF), str, true);
            }
            try {
                return c(new GZIPInputStream(exF.Q()), str);
            } catch (IOException e) {
                return new C3775jK(e);
            }
        } catch (Resources.NotFoundException e2) {
            return new C3775jK(e2);
        }
    }

    public static C3775jK f(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return g(context, zipInputStream, str);
        } finally {
            AbstractC3014ah0.b(zipInputStream);
        }
    }

    public static C3775jK g(Context context, ZipInputStream zipInputStream, String str) {
        MJ mjA;
        C3425fK c3425fK;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            mjA = null;
        } else {
            try {
                mjA = NJ.b.a(str);
            } catch (IOException e) {
                return new C3775jK(e);
            }
        }
        if (mjA != null) {
            return new C3775jK(mjA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        MJ mj = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                EX exF = AbstractC4496rb.f(AbstractC4496rb.x(zipInputStream));
                String[] strArr = MF.e;
                mj = (MJ) d(new WF(exF), null, false).f4549a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new C3775jK(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
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
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                AbstractC5005xJ.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                            }
                            map2.put(str3, typefaceCreateFromFile);
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
                    AbstractC5005xJ.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th5);
                }
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (mj == null) {
            return new C3775jK(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = mj.c().values().iterator();
            do {
                if (!it.hasNext()) {
                    c3425fK = null;
                    break;
                }
                c3425fK = (C3425fK) it.next();
            } while (!c3425fK.d.equals(str4));
            if (c3425fK != null) {
                c3425fK.f = AbstractC3014ah0.d((Bitmap) entry.getValue(), c3425fK.f4364a, c3425fK.b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (C3916kw c3916kw : mj.f.values()) {
                if (c3916kw.f4622a.equals(entry2.getKey())) {
                    c3916kw.d = (Typeface) entry2.getValue();
                    z = true;
                }
            }
            if (!z) {
                AbstractC5005xJ.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = mj.c().entrySet().iterator();
            while (it2.hasNext()) {
                C3425fK c3425fK2 = (C3425fK) ((Map.Entry) it2.next()).getValue();
                if (c3425fK2 == null) {
                    return null;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = Input.Keys.NUMPAD_ENTER;
                String str5 = c3425fK2.d;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        c3425fK2.f = AbstractC3014ah0.d(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), c3425fK2.f4364a, c3425fK2.b);
                    } catch (IllegalArgumentException e2) {
                        AbstractC5005xJ.c("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            NJ.b.f3451a.put(str, mj);
        }
        return new C3775jK(mj);
    }

    public static Boolean h(EX ex, byte[] bArr) {
        try {
            EX exH = ex.h();
            for (byte b2 : bArr) {
                if (exH.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            exH.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            AbstractC5005xJ.f5217a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void i() {
        ArrayList arrayList = new ArrayList(b);
        if (arrayList.size() <= 0) {
            return;
        }
        AbstractC3950lJ.z(arrayList.get(0));
        throw null;
    }

    public static String j(Context context, int i) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }
}
