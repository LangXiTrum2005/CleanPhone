package tout;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.Metadata;
import androidx.media3.common.polloi;
import androidx.media3.exoplayer.empress;
import androidx.media3.exoplayer.lampshade;
import androidx.media3.exoplayer.source.formularize;
import androidx.media3.exoplayer.triweekly;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import decarock.grimness;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: compiled from: MetadataRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern extends triweekly implements Handler.Callback {

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public long f38889creditor;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public boolean f38890grimness;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public final saneness f38891kattegat;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public final boolean f38892merc;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public nomenclative.attabal f38893polder;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
    public Metadata f38894privatdozent;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public final nomenclative.saneness f38895restrictive;

    /* JADX INFO: renamed from: saran, reason: collision with root package name */
    public long f38896saran;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public final attabal f38897sealless;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public boolean f38898seminary;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public final Handler f38899supplicat;

    public dern(saneness sanenessVar, Looper looper) {
        this(sanenessVar, looper, attabal.f38888attabal);
    }

    @Override // androidx.media3.exoplayer.lampshade
    public int attabal(polloi polloiVar) {
        if (this.f38897sealless.attabal(polloiVar)) {
            return lampshade.formularize(polloiVar.f11207polder == 0 ? 4 : 2);
        }
        return lampshade.formularize(0);
    }

    @SideEffectFree
    public final long cultivated(long j) {
        decarock.attabal.competently(j != C.TIME_UNSET);
        decarock.attabal.competently(this.f38889creditor != C.TIME_UNSET);
        return j - this.f38889creditor;
    }

    @Override // androidx.media3.exoplayer.homozygous, androidx.media3.exoplayer.lampshade
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        timberyard((Metadata) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.homozygous
    public boolean isEnded() {
        return this.f38890grimness;
    }

    @Override // androidx.media3.exoplayer.homozygous
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.triweekly
    public void mathsort(polloi[] polloiVarArr, long j, long j2, formularize.saneness sanenessVar) {
        this.f38893polder = this.f38897sealless.saneness(polloiVarArr[0]);
        Metadata metadata = this.f38894privatdozent;
        if (metadata != null) {
            this.f38894privatdozent = metadata.dern((metadata.f10589arytenoidectomy + this.f38889creditor) - j2);
        }
        this.f38889creditor = j2;
    }

    public final boolean milliradian(long j) {
        boolean z;
        Metadata metadata = this.f38894privatdozent;
        if (metadata == null || (!this.f38892merc && metadata.f10589arytenoidectomy > cultivated(j))) {
            z = false;
        } else {
            premeiotic(this.f38894privatdozent);
            this.f38894privatdozent = null;
            z = true;
        }
        if (this.f38898seminary && this.f38894privatdozent == null) {
            this.f38890grimness = true;
        }
        return z;
    }

    public final void permissivist(Metadata metadata, List<Metadata.Entry> list) {
        for (int i = 0; i < metadata.length(); i++) {
            polloi polloiVarMarial = metadata.wireman(i).marial();
            if (polloiVarMarial == null || !this.f38897sealless.attabal(polloiVarMarial)) {
                list.add(metadata.wireman(i));
            } else {
                nomenclative.attabal attabalVarSaneness = this.f38897sealless.saneness(polloiVarMarial);
                byte[] bArr = (byte[]) decarock.attabal.marial(metadata.wireman(i).preterite());
                this.f38895restrictive.dern();
                this.f38895restrictive.kowloon(bArr.length);
                ((ByteBuffer) grimness.impromptu(this.f38895restrictive.f11483polloi)).put(bArr);
                this.f38895restrictive.arytenoidectomy();
                Metadata metadataAttabal = attabalVarSaneness.attabal(this.f38895restrictive);
                if (metadataAttabal != null) {
                    permissivist(metadataAttabal, list);
                }
            }
        }
    }

    public final void premeiotic(Metadata metadata) {
        Handler handler = this.f38899supplicat;
        if (handler != null) {
            handler.obtainMessage(1, metadata).sendToTarget();
        } else {
            timberyard(metadata);
        }
    }

    @Override // androidx.media3.exoplayer.triweekly
    public void privatdozent(long j, boolean z) {
        this.f38894privatdozent = null;
        this.f38898seminary = false;
        this.f38890grimness = false;
    }

    @Override // androidx.media3.exoplayer.homozygous
    public void render(long j, long j2) {
        boolean zMilliradian = true;
        while (zMilliradian) {
            treadless();
            zMilliradian = milliradian(j);
        }
    }

    @Override // androidx.media3.exoplayer.triweekly
    public void seminary() {
        this.f38894privatdozent = null;
        this.f38893polder = null;
        this.f38889creditor = C.TIME_UNSET;
    }

    public final void timberyard(Metadata metadata) {
        this.f38891kattegat.onMetadata(metadata);
    }

    public final void treadless() {
        if (this.f38898seminary || this.f38894privatdozent != null) {
            return;
        }
        this.f38895restrictive.dern();
        empress empressVarSealless = sealless();
        int iOverspeculate = overspeculate(empressVarSealless, this.f38895restrictive, 0);
        if (iOverspeculate != -4) {
            if (iOverspeculate == -5) {
                this.f38896saran = ((polloi) decarock.attabal.marial(empressVarSealless.f11879saneness)).f11204molybdenite;
                return;
            }
            return;
        }
        if (this.f38895restrictive.taiyuan()) {
            this.f38898seminary = true;
            return;
        }
        if (this.f38895restrictive.f11480graveside >= supplicat()) {
            nomenclative.saneness sanenessVar = this.f38895restrictive;
            sanenessVar.f33943rotuma = this.f38896saran;
            sanenessVar.arytenoidectomy();
            Metadata metadataAttabal = ((nomenclative.attabal) grimness.impromptu(this.f38893polder)).attabal(this.f38895restrictive);
            if (metadataAttabal != null) {
                ArrayList arrayList = new ArrayList(metadataAttabal.length());
                permissivist(metadataAttabal, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f38894privatdozent = new Metadata(cultivated(this.f38895restrictive.f11480graveside), arrayList);
            }
        }
    }

    public dern(saneness sanenessVar, Looper looper, attabal attabalVar) {
        this(sanenessVar, looper, attabalVar, false);
    }

    public dern(saneness sanenessVar, Looper looper, attabal attabalVar, boolean z) {
        super(5);
        this.f38891kattegat = (saneness) decarock.attabal.marial(sanenessVar);
        this.f38899supplicat = looper == null ? null : grimness.preprohormone(looper, this);
        this.f38897sealless = (attabal) decarock.attabal.marial(attabalVar);
        this.f38892merc = z;
        this.f38895restrictive = new nomenclative.saneness();
        this.f38889creditor = C.TIME_UNSET;
    }
}
