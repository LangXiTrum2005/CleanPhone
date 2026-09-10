package sevenfold;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.util.apical;
import com.bumptech.glide.util.formularize;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: GifFrameLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class competently {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public boolean f37546apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f37547arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final terni.attabal f37548attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f37549beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f37550competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public attabal f37551cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final List<saneness> f37552dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public attabal f37553formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public Bitmap f37554impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f37555impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public attabal f37556kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final trawler.wireman f37557marial;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f37558monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f37559polloi;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Handler f37560saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public com.bumptech.glide.competently<Bitmap> f37561taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public maggot.competently<Bitmap> f37562triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final com.bumptech.glide.impromptu f37563wireman;

    /* JADX INFO: compiled from: GifFrameLoader.java */
    public static class attabal extends belongingness.attabal<Bitmap> {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public Bitmap f37564adultoid;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public final long f37565graveside;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public final int f37566molybdenite;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final Handler f37567polloi;

        public attabal(Handler handler, int i, long j) {
            this.f37567polloi = handler;
            this.f37566molybdenite = i;
            this.f37565graveside = j;
        }

        @Override // belongingness.wireman
        public void beachfront(Drawable drawable) {
            this.f37564adultoid = null;
        }

        @Override // belongingness.wireman
        /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
        public void attabal(Bitmap bitmap, quadrennium.saneness<? super Bitmap> sanenessVar) {
            this.f37564adultoid = bitmap;
            this.f37567polloi.sendMessageAtTime(this.f37567polloi.obtainMessage(1, this), this.f37565graveside);
        }

        public Bitmap dern() {
            return this.f37564adultoid;
        }
    }

    /* JADX INFO: compiled from: GifFrameLoader.java */
    public class dern implements Handler.Callback {
        public dern() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                competently.this.impassible((attabal) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            competently.this.f37563wireman.taiyuan((attabal) message.obj);
            return false;
        }
    }

    /* JADX INFO: compiled from: GifFrameLoader.java */
    public interface saneness {
        void attabal();
    }

    public competently(com.bumptech.glide.saneness sanenessVar, terni.attabal attabalVar, int i, int i2, maggot.competently<Bitmap> competentlyVar, Bitmap bitmap) {
        this(sanenessVar.beachfront(), com.bumptech.glide.saneness.graveside(sanenessVar.impromptu()), attabalVar, null, taiyuan(com.bumptech.glide.saneness.graveside(sanenessVar.impromptu()), i, i2), competentlyVar, bitmap);
    }

    public static maggot.saneness competently() {
        return new leafed.saneness(Double.valueOf(Math.random()));
    }

    public static com.bumptech.glide.competently<Bitmap> taiyuan(com.bumptech.glide.impromptu impromptuVar, int i, int i2) {
        return impromptuVar.competently().attabal(awlwort.competently.cultivated(endosteum.dern.f25717saneness).dent(true).mathsort(true).grimness(i, i2));
    }

    public int apical() {
        return this.f37558monoploid;
    }

    public final void arytenoidectomy() {
        if (this.f37549beachfront) {
            return;
        }
        this.f37549beachfront = true;
        this.f37546apical = false;
        formularize();
    }

    public void attabal() {
        this.f37552dern.clear();
        triweekly();
        monoploid();
        attabal attabalVar = this.f37551cutely;
        if (attabalVar != null) {
            this.f37563wireman.taiyuan(attabalVar);
            this.f37551cutely = null;
        }
        attabal attabalVar2 = this.f37553formularize;
        if (attabalVar2 != null) {
            this.f37563wireman.taiyuan(attabalVar2);
            this.f37553formularize = null;
        }
        attabal attabalVar3 = this.f37556kowloon;
        if (attabalVar3 != null) {
            this.f37563wireman.taiyuan(attabalVar3);
            this.f37556kowloon = null;
        }
        this.f37548attabal.clear();
        this.f37546apical = true;
    }

    public int beachfront() {
        return this.f37548attabal.dern();
    }

    public int cutely() {
        return this.f37548attabal.impromptu() + this.f37547arytenoidectomy;
    }

    public Bitmap dern() {
        attabal attabalVar = this.f37551cutely;
        return attabalVar != null ? attabalVar.dern() : this.f37554impassible;
    }

    public final void formularize() {
        if (!this.f37549beachfront || this.f37550competently) {
            return;
        }
        if (this.f37555impromptu) {
            apical.attabal(this.f37556kowloon == null, "Pending target must be null when starting from the first frame");
            this.f37548attabal.beachfront();
            this.f37555impromptu = false;
        }
        attabal attabalVar = this.f37556kowloon;
        if (attabalVar != null) {
            this.f37556kowloon = null;
            impassible(attabalVar);
            return;
        }
        this.f37550competently = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f37548attabal.marial());
        this.f37548attabal.saneness();
        this.f37553formularize = new attabal(this.f37560saneness, this.f37548attabal.competently(), jUptimeMillis);
        this.f37561taiyuan.attabal(awlwort.competently.premeiotic(competently())).coi(this.f37548attabal).nosophobia(this.f37553formularize);
    }

    public void impassible(attabal attabalVar) {
        this.f37550competently = false;
        if (this.f37546apical) {
            this.f37560saneness.obtainMessage(2, attabalVar).sendToTarget();
            return;
        }
        if (!this.f37549beachfront) {
            if (this.f37555impromptu) {
                this.f37560saneness.obtainMessage(2, attabalVar).sendToTarget();
                return;
            } else {
                this.f37556kowloon = attabalVar;
                return;
            }
        }
        if (attabalVar.dern() != null) {
            triweekly();
            attabal attabalVar2 = this.f37551cutely;
            this.f37551cutely = attabalVar;
            for (int size = this.f37552dern.size() - 1; size >= 0; size--) {
                this.f37552dern.get(size).attabal();
            }
            if (attabalVar2 != null) {
                this.f37560saneness.obtainMessage(2, attabalVar2).sendToTarget();
            }
        }
        formularize();
    }

    public int impromptu() {
        return this.f37559polloi;
    }

    public void kowloon(maggot.competently<Bitmap> competentlyVar, Bitmap bitmap) {
        this.f37562triweekly = (maggot.competently) apical.wireman(competentlyVar);
        this.f37554impassible = (Bitmap) apical.wireman(bitmap);
        this.f37561taiyuan = this.f37561taiyuan.attabal(new awlwort.competently().overspeculate(competentlyVar));
        this.f37547arytenoidectomy = formularize.taiyuan(bitmap);
        this.f37558monoploid = bitmap.getWidth();
        this.f37559polloi = bitmap.getHeight();
    }

    public Bitmap marial() {
        return this.f37554impassible;
    }

    public void molybdenite(saneness sanenessVar) {
        this.f37552dern.remove(sanenessVar);
        if (this.f37552dern.isEmpty()) {
            monoploid();
        }
    }

    public final void monoploid() {
        this.f37549beachfront = false;
    }

    public void polloi(saneness sanenessVar) {
        if (this.f37546apical) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f37552dern.contains(sanenessVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f37552dern.isEmpty();
        this.f37552dern.add(sanenessVar);
        if (zIsEmpty) {
            arytenoidectomy();
        }
    }

    public ByteBuffer saneness() {
        return this.f37548attabal.getData().asReadOnlyBuffer();
    }

    public final void triweekly() {
        Bitmap bitmap = this.f37554impassible;
        if (bitmap != null) {
            this.f37557marial.dern(bitmap);
            this.f37554impassible = null;
        }
    }

    public int wireman() {
        attabal attabalVar = this.f37551cutely;
        if (attabalVar != null) {
            return attabalVar.f37566molybdenite;
        }
        return -1;
    }

    public competently(trawler.wireman wiremanVar, com.bumptech.glide.impromptu impromptuVar, terni.attabal attabalVar, Handler handler, com.bumptech.glide.competently<Bitmap> competentlyVar, maggot.competently<Bitmap> competentlyVar2, Bitmap bitmap) {
        this.f37552dern = new ArrayList();
        this.f37563wireman = impromptuVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new dern()) : handler;
        this.f37557marial = wiremanVar;
        this.f37560saneness = handler;
        this.f37561taiyuan = competentlyVar;
        this.f37548attabal = attabalVar;
        kowloon(competentlyVar2, bitmap);
    }
}
