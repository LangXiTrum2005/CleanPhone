package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.storage.androidcleaner.R;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f44063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f44064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f44065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f44066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f44067f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f44069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f44070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f44071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Message f44072k;
    public Button l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public NestedScrollView f44073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f44074n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f44075o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f44076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f44077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f44078r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ListAdapter f44079s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f44081u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f44082v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f44083w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f44084x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f44085y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final androidx.localbroadcastmanager.content.a f44086z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f44068g = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f44080t = -1;
    public final a A = new a(this, 0);

    public e(Context context, f fVar, Window window) {
        this.f44062a = context;
        this.f44063b = fVar;
        this.f44064c = window;
        androidx.localbroadcastmanager.content.a aVar = new androidx.localbroadcastmanager.content.a();
        aVar.f4627b = new WeakReference(fVar);
        this.f44086z = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, j.a.f43521e, R.attr.alertDialogStyle, 0);
        this.f44081u = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f44082v = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f44083w = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f44084x = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f44085y = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        fVar.c().g(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
