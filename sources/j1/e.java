package j1;

import android.media.AudioFocusRequest;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f43586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f43587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1.e f43588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f43589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AudioFocusRequest f43590f;

    public e(int i10, b bVar, Handler handler, i1.e eVar, boolean z10) {
        this.f43585a = i10;
        this.f43587c = handler;
        this.f43588d = eVar;
        this.f43589e = z10;
        this.f43586b = bVar;
        this.f43590f = new AudioFocusRequest.Builder(i10).setAudioAttributes(eVar.a()).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(bVar, handler).build();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f43585a == eVar.f43585a && this.f43589e == eVar.f43589e && equals(eVar.f43586b) && Objects.equals(this.f43587c, eVar.f43587c) && Objects.equals(this.f43588d, eVar.f43588d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f43585a), this.f43586b, this.f43587c, this.f43588d, Boolean.valueOf(this.f43589e));
    }
}
