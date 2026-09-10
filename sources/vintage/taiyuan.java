package vintage;

import android.content.res.Resources;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.hardpan;
import androidx.core.view.premeiotic;
import androidx.core.view.supplicat;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\n\u001a\u0019\u0010\r\u001a\u00020\b*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\n\u001a\u0011\u0010\u0010\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\n\u001a\u0011\u0010\u0011\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\n\u001a\u0011\u0010\u0012\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\n\u001a\u0011\u0010\u0013\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\u0013\u0010\n\u001a\u0011\u0010\u0014\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\u0014\u0010\n¨\u0006\u0015"}, d2 = {"Landroid/view/View;", "", "taiyuan", "(Landroid/view/View;)Z", "", IronSourceConstants.EVENTS_DURATION, "cutely", "(Landroid/view/View;J)Z", "", "marial", "(Landroid/view/View;)V", "competently", "value", "molybdenite", "(Landroid/view/View;Z)V", "apical", "impassible", "kowloon", "arytenoidectomy", "monoploid", "polloi", "app_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class taiyuan {
    public static final void apical(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        premeiotic.picketboat(view, new supplicat() { // from class: vintage.beachfront
            @Override // androidx.core.view.supplicat
            public final hardpan attabal(View view2, hardpan hardpanVar) {
                return taiyuan.formularize(view2, hardpanVar);
            }
        });
    }

    public static final void arytenoidectomy(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setBackground(new leh.wireman(new int[]{Color.parseColor("#FFDE5D45"), Color.parseColor("#FF740865")}, new int[]{Color.parseColor("#66FFFFFF"), Color.parseColor("#66B0A5F4")}, (int) ((26 * Resources.getSystem().getDisplayMetrics().density) + 0.5f), (int) ((2 * Resources.getSystem().getDisplayMetrics().density) + 0.5f)));
    }

    public static final boolean beachfront(View view, View view2, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            view2.clearAnimation();
            premeiotic.marial(view2).competently(50L).beachfront(1.0f).impassible();
            return false;
        }
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            view.setPivotX(view.getWidth() / 2.0f);
            view.setPivotY(view.getHeight());
        }
        view2.clearAnimation();
        premeiotic.marial(view2).competently(50L).beachfront(0.9f).impassible();
        return false;
    }

    public static final void competently(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOnTouchListener(new View.OnTouchListener() { // from class: vintage.marial
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return taiyuan.impromptu(view2, motionEvent);
            }
        });
    }

    public static final boolean cutely(View view, long j) {
        long jLongValue;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (j == 0) {
            j = 600;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (view.getTag(-2076695469) != null) {
            Object tag = view.getTag(-2076695469);
            Intrinsics.competently(tag, "null cannot be cast to non-null type kotlin.Long");
            jLongValue = ((Long) tag).longValue();
        } else {
            jLongValue = 0;
        }
        if (jLongValue > jCurrentTimeMillis) {
            view.setTag(-2076695469, 0L);
            return false;
        }
        if (jCurrentTimeMillis - jLongValue < j) {
            return true;
        }
        view.setTag(-2076695469, Long.valueOf(jCurrentTimeMillis));
        return false;
    }

    public static final hardpan formularize(View view, hardpan insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        monroe.wireman wiremanVarBeachfront = insets.beachfront(hardpan.triweekly.competently());
        Intrinsics.checkNotNullExpressionValue(wiremanVarBeachfront, "getInsets(...)");
        view.setPadding(wiremanVarBeachfront.f33604attabal, wiremanVarBeachfront.f33606saneness, wiremanVarBeachfront.f33605dern, wiremanVarBeachfront.f33607wireman);
        return insets;
    }

    public static final void impassible(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        final int paddingBottom = view.getPaddingBottom();
        premeiotic.picketboat(view, new supplicat() { // from class: vintage.impromptu
            @Override // androidx.core.view.supplicat
            public final hardpan attabal(View view2, hardpan hardpanVar) {
                return taiyuan.triweekly(paddingBottom, view2, hardpanVar);
            }
        });
    }

    public static final boolean impromptu(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.clearAnimation();
            premeiotic.marial(view).competently(50L).marial(0.95f).beachfront(0.95f).impassible();
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        view.clearAnimation();
        premeiotic.marial(view).competently(50L).marial(1.0f).beachfront(1.0f).impassible();
        return false;
    }

    public static final void kowloon(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setBackground(new leh.wireman(new int[]{Color.parseColor("#FFE44CEA"), Color.parseColor("#FF250874")}, new int[]{Color.parseColor("#66FFFFFF"), Color.parseColor("#66B0A5F4")}, (int) ((26 * Resources.getSystem().getDisplayMetrics().density) + 0.5f), (int) ((2 * Resources.getSystem().getDisplayMetrics().density) + 0.5f)));
    }

    public static final void marial(final View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOnTouchListener(new View.OnTouchListener() { // from class: vintage.competently
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return taiyuan.beachfront(view, view2, motionEvent);
            }
        });
    }

    public static final void molybdenite(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (!z) {
            premeiotic.picketboat(view, null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        int iSaneness = view.getResources().getConfiguration().orientation == 2 ? 0 : com.blankj.utilcode.util.marial.saneness();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Intrinsics.competently(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, iSaneness + i, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
        view.setLayoutParams(layoutParams2);
    }

    public static final void monoploid(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setBackground(new leh.wireman(new int[]{Color.parseColor("#FFA80EE8"), Color.parseColor("#FF3C0080")}, new int[]{Color.parseColor("#14FFFFFF"), Color.parseColor("#33CF6BF9")}, (int) ((13 * Resources.getSystem().getDisplayMetrics().density) + 0.5f), (int) ((2 * Resources.getSystem().getDisplayMetrics().density) + 0.5f)));
    }

    public static final void polloi(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setBackground(new leh.beachfront(new int[]{Color.parseColor("#FFF96DFF"), Color.parseColor("#FF55179E")}, new int[]{Color.parseColor("#4DFFFFFF"), Color.parseColor("#4DB0A5F4"), Color.parseColor("#4DFFFFFF")}, new int[]{Color.parseColor("#FFFFFFFF"), Color.parseColor("#00FFFFFF"), Color.parseColor("#00FFFFFF"), Color.parseColor("#00FFFFFF"), Color.parseColor("#00FFFFFF"), Color.parseColor("#00FFFFFF"), Color.parseColor("#FFFFFFFF")}, (int) ((13 * Resources.getSystem().getDisplayMetrics().density) + 0.5f), (int) ((2 * Resources.getSystem().getDisplayMetrics().density) + 0.5f)));
    }

    public static final boolean taiyuan(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return cutely(view, 0L);
    }

    public static final hardpan triweekly(int i, View view, hardpan insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        monroe.wireman wiremanVarBeachfront = insets.beachfront(hardpan.triweekly.competently());
        Intrinsics.checkNotNullExpressionValue(wiremanVarBeachfront, "getInsets(...)");
        view.setPadding(wiremanVarBeachfront.f33604attabal, view.getPaddingTop(), wiremanVarBeachfront.f33605dern, i + wiremanVarBeachfront.f33607wireman);
        return insets;
    }
}
