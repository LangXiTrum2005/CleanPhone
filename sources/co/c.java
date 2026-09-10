package co;

import com.google.android.gms.internal.ads.dh1;
import com.google.android.gms.internal.ads.qq1;
import com.google.android.gms.internal.ads.v71;
import com.google.android.gms.internal.measurement.dg;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.mb;
import com.google.android.gms.internal.measurement.rg;
import eb.j;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import java.util.WeakHashMap;
import javax.crypto.Cipher;
import kb.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6793a;

    public /* synthetic */ c(int i10) {
        this.f6793a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:89:0x0154  */
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        SecureRandom secureRandom;
        SecureRandom secureRandom2;
        Provider provider = null;
        switch (this.f6793a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(yn.a.f54563d);
                return simpleDateFormat;
            case 1:
                return Boolean.FALSE;
            case 2:
                return ByteBuffer.allocate(32);
            case 3:
                try {
                    return (Cipher) qq1.f19163b.f19169a.zza("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            case 4:
                try {
                    Cipher cipher = (Cipher) qq1.f19163b.f19169a.zza("AES/GCM-SIV/NoPadding");
                    if (dh1.b(cipher)) {
                        return cipher;
                    }
                    return null;
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
            case 5:
                Provider providerD = v71.d();
                if (providerD == null) {
                    provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                    if (provider != null) {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                    } else {
                        secureRandom = new SecureRandom();
                    }
                    break;
                } else {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", providerD);
                    } catch (GeneralSecurityException unused) {
                        try {
                            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                        } catch (Throwable unused2) {
                        }
                        if (provider != null) {
                            try {
                                secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                            } catch (GeneralSecurityException unused3) {
                                secureRandom = new SecureRandom();
                            }
                        } else {
                            secureRandom = new SecureRandom();
                        }
                    }
                    break;
                }
                secureRandom.nextLong();
                return secureRandom;
            case 6:
                try {
                    return (Cipher) qq1.f19163b.f19169a.zza("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e12) {
                    throw new IllegalStateException(e12);
                }
            case 7:
                try {
                    return (Cipher) qq1.f19163b.f19169a.zza("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e13) {
                    throw new IllegalStateException(e13);
                }
            case 8:
                try {
                    return (Cipher) qq1.f19163b.f19169a.zza("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e14) {
                    throw new IllegalStateException(e14);
                }
            case 9:
                e0 e0Var = new e0();
                e0Var.f23404a = 0;
                return e0Var;
            case 10:
                mb.e(Thread.currentThread());
                rg rgVar = new rg();
                rgVar.f23943a = false;
                rgVar.f23944b = null;
                Thread threadCurrentThread = Thread.currentThread();
                WeakHashMap weakHashMap = dg.f23393b;
                synchronized (weakHashMap) {
                    weakHashMap.put(threadCurrentThread, rgVar);
                    break;
                }
                return rgVar;
            case 11:
                return new Random();
            case 12:
                Provider providerA = j.a();
                if (providerA == null) {
                    provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                    if (provider != null) {
                        secureRandom2 = SecureRandom.getInstance("SHA1PRNG", provider);
                    } else {
                        secureRandom2 = new SecureRandom();
                    }
                    break;
                } else {
                    try {
                        secureRandom2 = SecureRandom.getInstance("SHA1PRNG", providerA);
                    } catch (GeneralSecurityException unused4) {
                        try {
                            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                        } catch (Throwable unused5) {
                        }
                        if (provider != null) {
                            try {
                                secureRandom2 = SecureRandom.getInstance("SHA1PRNG", provider);
                            } catch (GeneralSecurityException unused6) {
                                secureRandom2 = new SecureRandom();
                            }
                        } else {
                            secureRandom2 = new SecureRandom();
                        }
                    }
                    break;
                }
                secureRandom2.nextLong();
                return secureRandom2;
            case 13:
                try {
                    return (Cipher) i.f44572b.f44574a.l("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e15) {
                    throw new IllegalStateException(e15);
                }
            case 14:
                try {
                    return (Cipher) i.f44572b.f44574a.l("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e16) {
                    throw new IllegalStateException(e16);
                }
            case 15:
                try {
                    return (Cipher) i.f44572b.f44574a.l("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e17) {
                    throw new IllegalStateException(e17);
                }
            case 16:
                try {
                    return (Cipher) i.f44572b.f44574a.l("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e18) {
                    throw new IllegalStateException(e18);
                }
            case 17:
                return new Random();
            case 18:
                return 0L;
            case 19:
                try {
                    return (Cipher) i.f44572b.f44574a.l("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e19) {
                    throw new IllegalStateException(e19);
                }
            default:
                try {
                    Cipher cipher2 = (Cipher) i.f44572b.f44574a.l("AES/GCM-SIV/NoPadding");
                    if (xa.f.c(cipher2)) {
                        return cipher2;
                    }
                    return null;
                } catch (GeneralSecurityException e20) {
                    throw new IllegalStateException(e20);
                }
        }
    }
}
