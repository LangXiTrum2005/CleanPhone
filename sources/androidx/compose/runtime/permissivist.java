package androidx.compose.runtime;

import com.ironsource.X3;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/permissivist;", "", "", X3.i.W, "objectKey", "location", "nodes", "index", "<init>", "(ILjava/lang/Object;III)V", "attabal", "I", "()I", "saneness", "Ljava/lang/Object;", "wireman", "()Ljava/lang/Object;", "dern", "marial", "getIndex", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class permissivist {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final int key;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final int location;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Object objectKey;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final int nodes;

    public permissivist(int i, Object obj, int i2, int i3, int i4) {
        this.key = i;
        this.objectKey = obj;
        this.location = i2;
        this.nodes = i3;
        this.index = i4;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final int getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final int getNodes() {
        return this.nodes;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final Object getObjectKey() {
        return this.objectKey;
    }
}
