package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import j.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3836b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f43535t);
        this.f3836b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f3835a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
