package overspeculate;

import android.content.res.Configuration;
import com.ironsource.C3414a2;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VectorResources.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003R<\u0010\u000f\u001a*\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nj\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0010"}, d2 = {"Loverspeculate/attabal;", "", "<init>", "()V", "", "configChanges", "", "saneness", "(I)V", "attabal", "Ljava/util/HashMap;", "Ljava/lang/ref/WeakReference;", "Loverspeculate/attabal$attabal;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "map", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final HashMap<Object, WeakReference<ImageVectorEntry>> map = new HashMap<>();

    /* JADX INFO: renamed from: overspeculate.attabal$attabal, reason: collision with other inner class name and from toString */
    /* JADX INFO: compiled from: VectorResources.android.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\r\u0010\u0007¨\u0006\u0015"}, d2 = {"Loverspeculate/attabal$attabal;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Lseminary/attabal;", "attabal", "Lseminary/attabal;", "getImageVector", "()Lseminary/attabal;", "imageVector", "saneness", "I", "configFlags", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ImageVectorEntry {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
        public final seminary.attabal imageVector;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
        public final int configFlags;

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final int getConfigFlags() {
            return this.configFlags;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageVectorEntry)) {
                return false;
            }
            ImageVectorEntry imageVectorEntry = (ImageVectorEntry) other;
            return Intrinsics.wireman(this.imageVector, imageVectorEntry.imageVector) && this.configFlags == imageVectorEntry.configFlags;
        }

        public int hashCode() {
            return (this.imageVector.hashCode() * 31) + Integer.hashCode(this.configFlags);
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.imageVector + ", configFlags=" + this.configFlags + ')';
        }
    }

    public final void attabal() {
        this.map.clear();
    }

    public final void saneness(int configChanges) {
        Iterator<Map.Entry<Object, WeakReference<ImageVectorEntry>>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            ImageVectorEntry imageVectorEntry = it.next().getValue().get();
            if (imageVectorEntry == null || Configuration.needNewResources(configChanges, imageVectorEntry.getConfigFlags())) {
                it.remove();
            }
        }
    }
}
