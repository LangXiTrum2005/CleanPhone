package formularism;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\rJ\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\u0011\u0010\u001f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000f¨\u0006 "}, d2 = {"Lformularism/apical;", "", "<init>", "()V", "", "id", "value", "impromptu", "(II)Lformularism/apical;", "", "beachfront", "(I)Z", "attabal", "(I)I", "taiyuan", "()I", "wireman", "defaultValue", "marial", C3414a2.d, "", "competently", "(Lformularism/apical;)V", "I", "set", "", "saneness", "[I", "values", "headerTableSize", "dern", "initialWindowSize", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public int set;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final int[] values = new int[10];

    public final int attabal(int id) {
        return this.values[id];
    }

    public final boolean beachfront(int id) {
        return ((1 << id) & this.set) != 0;
    }

    public final void competently(apical other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i = 0;
        while (i < 10) {
            int i2 = i + 1;
            if (other.beachfront(i)) {
                impromptu(i, other.attabal(i));
            }
            i = i2;
        }
    }

    public final int dern() {
        return (this.set & 128) != 0 ? this.values[7] : Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    public final apical impromptu(int id, int value) {
        if (id >= 0) {
            int[] iArr = this.values;
            if (id < iArr.length) {
                this.set = (1 << id) | this.set;
                iArr[id] = value;
            }
        }
        return this;
    }

    public final int marial(int defaultValue) {
        return (this.set & 32) != 0 ? this.values[5] : defaultValue;
    }

    public final int saneness() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    public final int taiyuan() {
        return Integer.bitCount(this.set);
    }

    public final int wireman() {
        if ((this.set & 16) != 0) {
            return this.values[4];
        }
        return Integer.MAX_VALUE;
    }
}
