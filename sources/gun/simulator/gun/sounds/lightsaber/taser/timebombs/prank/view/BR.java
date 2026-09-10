package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class BR {
    public static BR e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2872a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ BR(Object obj, Object obj2, Serializable serializable, int i) {
        this.b = obj;
        this.c = obj2;
        this.d = serializable;
        this.f2872a = i;
    }

    public static void a(int i, BR br) {
        synchronized (br.d) {
            try {
                if (br.f2872a == i) {
                    return;
                }
                br.f2872a = i;
                for (WeakReference weakReference : (CopyOnWriteArrayList) br.c) {
                    C2367Dm c2367Dm = (C2367Dm) weakReference.get();
                    if (c2367Dm != null) {
                        c2367Dm.a(i);
                    } else {
                        ((CopyOnWriteArrayList) br.c).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized BR d(Context context) {
        try {
            if (e == null) {
                e = new BR(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public final String b(int i, String str, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.f2872a;
            Object obj = this.b;
            if (i2 >= i3) {
                sb.append(((String[]) obj)[i3]);
                return sb.toString();
            }
            sb.append(((String[]) obj)[i2]);
            Object obj2 = this.c;
            if (((int[]) obj2)[i2] == 1) {
                sb.append(str);
            } else {
                int i4 = ((int[]) obj2)[i2];
                Object obj3 = this.d;
                if (i4 == 2) {
                    sb.append(String.format(Locale.US, ((String[]) obj3)[i2], Long.valueOf(j)));
                } else if (((int[]) obj2)[i2] == 3) {
                    sb.append(String.format(Locale.US, ((String[]) obj3)[i2], Integer.valueOf(i)));
                } else if (((int[]) obj2)[i2] == 4) {
                    sb.append(String.format(Locale.US, ((String[]) obj3)[i2], Long.valueOf(j2)));
                }
            }
            i2++;
        }
    }

    public final String c(Ig0 ig0, Uri uri, int i) throws KT {
        int i2 = this.f2872a;
        if (i2 == 1) {
            String str = ig0.b + ":" + ig0.c;
            Pattern pattern = AbstractC3486g10.f4397a;
            String strEncodeToString = Base64.encodeToString(str.getBytes(C3398f10.g), 0);
            int i3 = Ug0.f3833a;
            Locale locale = Locale.US;
            return AbstractC3888ke0.i("Basic ", strEncodeToString);
        }
        if (i2 != 2) {
            throw new KT(null, new UnsupportedOperationException(), false, 4);
        }
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            String strJ = AbstractC3486g10.j(i);
            String str2 = ig0.b + ":" + ((String) obj3) + ":" + ig0.c;
            Charset charset = C3398f10.g;
            String strV = Ug0.V(messageDigest.digest((Ug0.V(messageDigest.digest(str2.getBytes(charset))) + ":" + ((String) obj2) + ":" + Ug0.V(messageDigest.digest((strJ + ":" + uri).getBytes(charset)))).getBytes(charset)));
            boolean zIsEmpty = ((String) obj).isEmpty();
            String str3 = ig0.b;
            return zIsEmpty ? String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", str3, (String) obj3, (String) obj2, uri, strV) : String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", str3, (String) obj3, (String) obj2, uri, strV, (String) obj);
        } catch (NoSuchAlgorithmException e2) {
            throw new KT(null, e2, false, 4);
        }
    }

    public final int e() {
        int i;
        synchronized (this.d) {
            i = this.f2872a;
        }
        return i;
    }

    public BR(int i, String str, ArrayList arrayList, byte[] bArr) {
        this.f2872a = i;
        this.b = str;
        this.c = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.d = bArr;
    }

    public BR(int i, String str, String str2, String str3) {
        this.f2872a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public BR(Context context) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new CopyOnWriteArrayList();
        this.d = new Object();
        this.f2872a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C4024m70(this), intentFilter);
    }

    public BR(int i, InterfaceC3549gk interfaceC3549gk, EnumC5024xb enumC5024xb, InterfaceC4443qv interfaceC4443qv) {
        this.b = interfaceC4443qv;
        this.f2872a = i;
        this.c = enumC5024xb;
        this.d = interfaceC3549gk;
    }
}
