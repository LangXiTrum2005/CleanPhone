package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class AlertController {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f3290A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f3291B;
    public final int C;
    public final boolean D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Handler f3292E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AlertDialog f3295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f3296c;
    public CharSequence d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f3297e;
    public RecycleListView f;
    public View g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f3299i;
    public CharSequence j;
    public Message k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f3300l;
    public CharSequence m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Message f3301n;
    public Button o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f3302p;
    public Message q;
    public NestedScrollView r;
    public Drawable s;
    public ImageView t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f3303u;
    public TextView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f3304w;
    public ListAdapter x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f3305z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3298h = false;
    public int y = -1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final View.OnClickListener f3293F = new View.OnClickListener() { // from class: androidx.appcompat.app.AlertController.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f3299i && (message3 = alertController.k) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f3300l || (message2 = alertController.f3301n) == null) {
                messageObtain = (view != alertController.o || (message = alertController.q) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            alertController.f3292E.obtainMessage(1, alertController.f3295b).sendToTarget();
        }
    };

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$2, reason: invalid class name */
    class AnonymousClass2 implements NestedScrollView.OnScrollChangeListener {
        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public final void a(NestedScrollView nestedScrollView) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$3, reason: invalid class name */
    class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$4, reason: invalid class name */
    class AnonymousClass4 implements AbsListView.OnScrollListener {
        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
            throw null;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i2) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$5, reason: invalid class name */
    class AnonymousClass5 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static class AlertParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContextThemeWrapper f3306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f3307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Drawable f3308c;
        public CharSequence d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View f3309e;
        public String f;
        public CharSequence g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public DialogInterface.OnClickListener f3310h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f3311i;
        public DialogInterface.OnClickListener j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public DialogInterface.OnKeyListener f3312l;
        public Object m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f3313n;
        public View o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f3314p;
        public int q = -1;
        public boolean k = true;

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$AlertParams$1, reason: invalid class name */
        class AnonymousClass1 extends ArrayAdapter<CharSequence> {
            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public final View getView(int i2, View view, ViewGroup viewGroup) {
                super.getView(i2, view, viewGroup);
                throw null;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$AlertParams$2, reason: invalid class name */
        class AnonymousClass2 extends CursorAdapter {
            @Override // android.widget.CursorAdapter
            public final void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(0));
                cursor.getPosition();
                cursor.getInt(0);
                throw null;
            }

            @Override // android.widget.CursorAdapter
            public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$AlertParams$4, reason: invalid class name */
        class AnonymousClass4 implements AdapterView.OnItemClickListener {
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                throw null;
            }
        }

        public interface OnPrepareListViewListener {
        }

        public AlertParams(ContextThemeWrapper contextThemeWrapper) {
            this.f3306a = contextThemeWrapper;
            this.f3307b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    public static final class ButtonHandler extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference f3316a;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f3316a.get(), message.what);
            } else {
                if (i2 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class CheckedItemAdapter extends ArrayAdapter<CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public static class RecycleListView extends ListView {
        public final int e0;
        public final int f0;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.t);
            this.f0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.e0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public AlertController(Context context, AlertDialog alertDialog, Window window) {
        this.f3294a = context;
        this.f3295b = alertDialog;
        this.f3296c = window;
        ButtonHandler buttonHandler = new ButtonHandler();
        buttonHandler.f3316a = new WeakReference(alertDialog);
        this.f3292E = buttonHandler;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, androidx.appcompat.R.styleable.f3280e, com.charging.screenshow.battery.animations.themes.R.attr.alertDialogStyle, 0);
        this.f3305z = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f3290A = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f3291B = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.C = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.D = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        alertDialog.c().v(1);
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

    public final void c(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f3292E.obtainMessage(i2, onClickListener) : null;
        if (i2 == -3) {
            this.f3302p = charSequence;
            this.q = messageObtainMessage;
        } else if (i2 == -2) {
            this.m = charSequence;
            this.f3301n = messageObtainMessage;
        } else {
            if (i2 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.j = charSequence;
            this.k = messageObtainMessage;
        }
    }
}
