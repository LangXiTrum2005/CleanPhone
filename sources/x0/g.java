package x0;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import com.google.android.gms.internal.play_billing.q1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f53513j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile g f53514k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f53515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x.f f53516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f53517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f53518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vb.b f53519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f53520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v1.j f53521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f53522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f53523i;

    public g(m mVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f53515a = reentrantReadWriteLock;
        this.f53517c = 3;
        f fVar = (f) mVar.f4731b;
        this.f53520f = fVar;
        int i10 = mVar.f4730a;
        this.f53522h = i10;
        this.f53523i = (b) mVar.f4732c;
        this.f53518d = new Handler(Looper.getMainLooper());
        this.f53516b = new x.f(0);
        this.f53521g = new v1.j(6);
        vb.b bVar = new vb.b(this);
        this.f53519e = bVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f53517c = 0;
            } catch (Throwable th2) {
                this.f53515a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                fVar.c(new c(bVar));
            } catch (Throwable th3) {
                d(th3);
            }
        }
    }

    public static g a() {
        g gVar;
        synchronized (f53513j) {
            try {
                gVar = f53514k;
                if (!(gVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public final int b() {
        this.f53515a.readLock().lock();
        try {
            return this.f53517c;
        } finally {
            this.f53515a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f53522h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f53515a.writeLock().lock();
        try {
            if (this.f53517c == 0) {
                this.f53515a.writeLock().unlock();
                return;
            }
            this.f53517c = 0;
            this.f53515a.writeLock().unlock();
            vb.b bVar = this.f53519e;
            g gVar = (g) bVar.f52530a;
            try {
                gVar.f53520f.c(new c(bVar));
            } catch (Throwable th2) {
                gVar.d(th2);
            }
        } catch (Throwable th3) {
            this.f53515a.writeLock().unlock();
            throw th3;
        }
    }

    public final void d(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f53515a.writeLock().lock();
        try {
            this.f53517c = 2;
            arrayList.addAll(this.f53516b);
            this.f53516b.clear();
            this.f53515a.writeLock().unlock();
            this.f53518d.post(new com.google.android.gms.common.api.internal.q(arrayList, this.f53517c, th2));
        } catch (Throwable th3) {
            this.f53515a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0099 A[Catch: all -> 0x007c, TryCatch #3 {all -> 0x007c, blocks: (B:35:0x0054, B:38:0x0059, B:40:0x005d, B:42:0x006a, B:49:0x0089, B:51:0x0093, B:53:0x0096, B:55:0x0099, B:57:0x00a9, B:58:0x00ac), top: B:108:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9 A[Catch: all -> 0x007c, TryCatch #3 {all -> 0x007c, blocks: (B:35:0x0054, B:38:0x0059, B:40:0x005d, B:42:0x006a, B:49:0x0089, B:51:0x0093, B:53:0x0096, B:55:0x0099, B:57:0x00a9, B:58:0x00ac), top: B:108:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fd  */
    public final CharSequence e(CharSequence charSequence, int i10, int i11) throws Throwable {
        CharSequence charSequence2;
        Throwable th2;
        int i12;
        int i13;
        r[] rVarArr;
        int spanStart;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        if (!(i10 <= i11)) {
            throw new IllegalArgumentException("start should be <= than end");
        }
        s sVar = null;
        if (charSequence == null) {
            return null;
        }
        if (!(i10 <= charSequence.length())) {
            throw new IllegalArgumentException("start should be < than charSequence length");
        }
        if (!(i11 <= charSequence.length())) {
            throw new IllegalArgumentException("end should be < than charSequence length");
        }
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        qd.i iVar = (qd.i) this.f53519e.f52531b;
        iVar.getClass();
        boolean z10 = charSequence instanceof p;
        if (z10) {
            ((p) charSequence).a();
        }
        if (z10) {
            sVar = new s((Spannable) charSequence);
            if (sVar != null) {
                for (r rVar : rVarArr) {
                    spanStart = sVar.f53552b.getSpanStart(rVar);
                    int spanEnd = sVar.f53552b.getSpanEnd(rVar);
                    if (spanStart != i11) {
                        sVar.removeSpan(rVar);
                    }
                    i10 = Math.min(spanStart, i10);
                    i11 = Math.max(spanEnd, i11);
                }
            }
            i12 = i10;
            i13 = i11;
            if (i12 != i13) {
                charSequence2 = charSequence;
                if (!z10) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z10) {
                    return charSequence2;
                }
            }
            ((p) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    sVar = new s((Spannable) charSequence);
                } catch (Throwable th3) {
                    th = th3;
                    charSequence2 = charSequence;
                    th2 = th;
                    if (!z10) {
                        throw th2;
                    }
                    ((p) charSequence2).b();
                    throw th2;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i10 - 1, i11 + 1, r.class) <= i11) {
                sVar = new s();
                sVar.f53551a = false;
                sVar.f53552b = new SpannableString(charSequence);
            }
            if (sVar != null && (rVarArr = (r[]) sVar.f53552b.getSpans(i10, i11, r.class)) != null && rVarArr.length > 0) {
                while (i < r4) {
                    spanStart = sVar.f53552b.getSpanStart(rVar);
                    int spanEnd2 = sVar.f53552b.getSpanEnd(rVar);
                    if (spanStart != i11) {
                        sVar.removeSpan(rVar);
                    }
                    i10 = Math.min(spanStart, i10);
                    i11 = Math.max(spanEnd2, i11);
                }
            }
            i12 = i10;
            i13 = i11;
            if (i12 != i13 || i12 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z10) {
                    return charSequence2;
                }
            } else {
                try {
                    charSequence2 = charSequence;
                    try {
                        s sVar2 = (s) iVar.y(charSequence2, i12, i13, Integer.MAX_VALUE, false, new v6.c(sVar, (v1.j) iVar.f48980b));
                        if (sVar2 != null) {
                            Spannable spannable = sVar2.f53552b;
                            if (z10) {
                                ((p) charSequence2).b();
                            }
                            return spannable;
                        }
                        if (!z10) {
                            return charSequence2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        if (!z10) {
                            throw th2;
                        }
                        ((p) charSequence2).b();
                        throw th2;
                    }
                } catch (Throwable th5) {
                    charSequence2 = charSequence;
                    th2 = th5;
                }
            }
            ((p) charSequence2).b();
            return charSequence2;
        } catch (Throwable th6) {
            th2 = th6;
            charSequence2 = charSequence;
        }
        if (!z10) {
            throw th2;
        }
        ((p) charSequence2).b();
        throw th2;
    }

    public final void f(e eVar) {
        q1.e(eVar, "initCallback cannot be null");
        this.f53515a.writeLock().lock();
        try {
            if (this.f53517c == 1 || this.f53517c == 2) {
                this.f53518d.post(new com.google.android.gms.common.api.internal.q(Arrays.asList(eVar), this.f53517c, (Throwable) null));
            } else {
                this.f53516b.add(eVar);
            }
        } finally {
            this.f53515a.writeLock().unlock();
        }
    }
}
