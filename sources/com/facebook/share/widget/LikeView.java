package com.facebook.share.widget;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.FacebookException;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.internal.LikeActionController;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class LikeView extends FrameLayout {
    public static final /* synthetic */ int n0 = 0;
    public String e0;
    public ObjectType f0;
    public LikeActionController g0;
    public OnErrorListener h0;
    public BroadcastReceiver i0;
    public LikeActionControllerCreationCallback j0;
    public Style k0;
    public HorizontalAlignment l0;
    public AuxiliaryViewPosition m0;

    /* JADX INFO: renamed from: com.facebook.share.widget.LikeView$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (CrashShieldHandler.b(this)) {
                return;
            }
            try {
                int i2 = LikeView.n0;
                throw null;
            } catch (Throwable th) {
                CrashShieldHandler.a(this, th);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.widget.LikeView$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16637a;

        static {
            int[] iArr = new int[AuxiliaryViewPosition.values().length];
            f16637a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16637a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16637a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.facebook.share.widget.LikeView$AuxiliaryViewPosition, still in use, count: 1, list:
  (r0v0 com.facebook.share.widget.LikeView$AuxiliaryViewPosition) from 0x0024: SPUT (r0v0 com.facebook.share.widget.LikeView$AuxiliaryViewPosition) (LINE:37) com.facebook.share.widget.LikeView.AuxiliaryViewPosition.Y com.facebook.share.widget.LikeView$AuxiliaryViewPosition
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Deprecated
    public static final class AuxiliaryViewPosition {
        /* JADX INFO: Fake field, exist only in values array */
        BOTTOM("bottom"),
        /* JADX INFO: Fake field, exist only in values array */
        INLINE("inline"),
        /* JADX INFO: Fake field, exist only in values array */
        TOP("top");


        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final AuxiliaryViewPosition f16638Y;
        public final String X;

        static {
            f16638Y = auxiliaryViewPosition;
        }

        public AuxiliaryViewPosition(String str) {
            super(str, i);
            this.X = str;
        }

        public static AuxiliaryViewPosition valueOf(String str) {
            return (AuxiliaryViewPosition) Enum.valueOf(AuxiliaryViewPosition.class, str);
        }

        public static AuxiliaryViewPosition[] values() {
            return (AuxiliaryViewPosition[]) Z.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.X;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.facebook.share.widget.LikeView$HorizontalAlignment, still in use, count: 1, list:
  (r0v0 com.facebook.share.widget.LikeView$HorizontalAlignment) from 0x0024: SPUT (r0v0 com.facebook.share.widget.LikeView$HorizontalAlignment) (LINE:37) com.facebook.share.widget.LikeView.HorizontalAlignment.Y com.facebook.share.widget.LikeView$HorizontalAlignment
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Deprecated
    public static final class HorizontalAlignment {
        /* JADX INFO: Fake field, exist only in values array */
        CENTER(TtmlNode.CENTER),
        /* JADX INFO: Fake field, exist only in values array */
        LEFT(TtmlNode.LEFT),
        /* JADX INFO: Fake field, exist only in values array */
        RIGHT(TtmlNode.RIGHT);


        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final HorizontalAlignment f16639Y;
        public final String X;

        static {
            f16639Y = horizontalAlignment;
        }

        public HorizontalAlignment(String str) {
            super(str, i);
            this.X = str;
        }

        public static HorizontalAlignment valueOf(String str) {
            return (HorizontalAlignment) Enum.valueOf(HorizontalAlignment.class, str);
        }

        public static HorizontalAlignment[] values() {
            return (HorizontalAlignment[]) Z.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.X;
        }
    }

    public class LikeActionControllerCreationCallback implements LikeActionController.CreationCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f16640a;

        public LikeActionControllerCreationCallback() {
        }

        @Override // com.facebook.share.internal.LikeActionController.CreationCallback
        public final void a(LikeActionController likeActionController, FacebookException facebookException) {
            OnErrorListener onErrorListener;
            if (this.f16640a) {
                return;
            }
            LikeView likeView = LikeView.this;
            if (likeActionController == null) {
                if (facebookException != null && (onErrorListener = likeView.h0) != null) {
                    onErrorListener.a();
                }
                likeView.j0 = null;
                return;
            }
            new FacebookException("Cannot use LikeView. The device may not be supported.");
            likeView.g0 = likeActionController;
            likeView.i0 = likeView.new LikeControllerBroadcastReceiver();
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(likeView.getContext());
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.facebook.sdk.LikeActionController.UPDATED");
            intentFilter.addAction("com.facebook.sdk.LikeActionController.DID_ERROR");
            intentFilter.addAction("com.facebook.sdk.LikeActionController.DID_RESET");
            localBroadcastManager.registerReceiver(likeView.i0, intentFilter);
            likeView.b();
            throw null;
        }
    }

    public class LikeControllerBroadcastReceiver extends BroadcastReceiver {
        public LikeControllerBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Bundle extras = intent.getExtras();
            LikeView likeView = LikeView.this;
            if (extras != null) {
                String string = extras.getString("com.facebook.sdk.LikeActionController.OBJECT_ID");
                if (!Utility.C(string) && !Utility.a(likeView.e0, string)) {
                    return;
                }
            }
            if ("com.facebook.sdk.LikeActionController.UPDATED".equals(action)) {
                int i2 = LikeView.n0;
                likeView.b();
                throw null;
            }
            if (!"com.facebook.sdk.LikeActionController.DID_ERROR".equals(action)) {
                if ("com.facebook.sdk.LikeActionController.DID_RESET".equals(action)) {
                    likeView.a(likeView.e0, likeView.f0);
                    likeView.b();
                    throw null;
                }
                return;
            }
            OnErrorListener onErrorListener = likeView.h0;
            if (onErrorListener != null) {
                NativeProtocol.k(extras);
                onErrorListener.a();
            }
        }
    }

    @Deprecated
    public enum ObjectType {
        UNKNOWN("unknown", 0),
        /* JADX INFO: Fake field, exist only in values array */
        OPEN_GRAPH("open_graph", 1),
        PAGE("page", 2);

        public final String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f16643Y;

        ObjectType(String str, int i2) {
            this.X = str;
            this.f16643Y = i2;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.X;
        }
    }

    public interface OnErrorListener {
        void a();
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.facebook.share.widget.LikeView$Style, still in use, count: 1, list:
  (r0v0 com.facebook.share.widget.LikeView$Style) from 0x0024: SPUT (r0v0 com.facebook.share.widget.LikeView$Style) (LINE:37) com.facebook.share.widget.LikeView.Style.Y com.facebook.share.widget.LikeView$Style
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Deprecated
    public static final class Style {
        /* JADX INFO: Fake field, exist only in values array */
        STANDARD("standard"),
        /* JADX INFO: Fake field, exist only in values array */
        BUTTON("button"),
        /* JADX INFO: Fake field, exist only in values array */
        BOX_COUNT("box_count");


        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Style f16644Y;
        public final String X;

        static {
            f16644Y = style;
        }

        public Style(String str) {
            super(str, i);
            this.X = str;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) Z.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.X;
        }
    }

    private Activity getActivity() {
        boolean z2;
        Context context = getContext();
        while (true) {
            z2 = context instanceof Activity;
            if (z2 || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (z2) {
            return (Activity) context;
        }
        throw new FacebookException("Unable to get Activity.");
    }

    private Bundle getAnalyticsParameters() {
        Bundle bundle = new Bundle();
        bundle.putString("style", this.k0.X);
        bundle.putString("auxiliary_position", this.m0.X);
        bundle.putString("horizontal_alignment", this.l0.X);
        bundle.putString("object_id", Utility.f(this.e0, ""));
        bundle.putString("object_type", this.f0.X);
        return bundle;
    }

    public final void a(String str, ObjectType objectType) {
        if (this.i0 != null) {
            LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this.i0);
            this.i0 = null;
        }
        LikeActionControllerCreationCallback likeActionControllerCreationCallback = this.j0;
        if (likeActionControllerCreationCallback != null) {
            likeActionControllerCreationCallback.f16640a = true;
            this.j0 = null;
        }
        this.g0 = null;
        this.e0 = str;
        this.f0 = objectType;
        if (Utility.C(str)) {
            return;
        }
        this.j0 = new LikeActionControllerCreationCallback();
        if (isInEditMode()) {
            return;
        }
        LikeActionController.i(str, objectType, this.j0);
    }

    public final void b() {
        this.g0.getClass();
        boolean z2 = this.g0.f16539c;
        throw null;
    }

    @Deprecated
    public OnErrorListener getOnErrorListener() {
        return this.h0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ObjectType objectType = ObjectType.UNKNOWN;
        String strF = Utility.f(null, null);
        if (Utility.a(strF, this.e0) && objectType == this.f0) {
            super.onDetachedFromWindow();
        } else {
            a(strF, objectType);
            b();
            throw null;
        }
    }

    @Deprecated
    public void setAuxiliaryViewPosition(AuxiliaryViewPosition auxiliaryViewPosition) {
        if (auxiliaryViewPosition == null) {
            auxiliaryViewPosition = AuxiliaryViewPosition.f16638Y;
        }
        if (this.m0 == auxiliaryViewPosition) {
            return;
        }
        this.m0 = auxiliaryViewPosition;
        throw null;
    }

    @Override // android.view.View
    @Deprecated
    public void setEnabled(boolean z2) {
        b();
        throw null;
    }

    @Deprecated
    public void setForegroundColor(int i2) {
        if (i2 != 0) {
            throw null;
        }
    }

    @Deprecated
    public void setFragment(Fragment fragment) {
        new FragmentWrapper(fragment);
    }

    @Deprecated
    public void setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
        if (horizontalAlignment == null) {
            horizontalAlignment = HorizontalAlignment.f16639Y;
        }
        if (this.l0 == horizontalAlignment) {
            return;
        }
        this.l0 = horizontalAlignment;
        throw null;
    }

    @Deprecated
    public void setLikeViewStyle(Style style) {
        if (style == null) {
            style = Style.f16644Y;
        }
        if (this.k0 == style) {
            return;
        }
        this.k0 = style;
        throw null;
    }

    @Deprecated
    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.h0 = onErrorListener;
    }

    @Deprecated
    public void setFragment(android.app.Fragment fragment) {
        new FragmentWrapper(fragment);
    }
}
