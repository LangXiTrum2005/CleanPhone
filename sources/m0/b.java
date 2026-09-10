package m0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.storage.androidcleaner.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f45678c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f45679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f45680b;

    public b() {
        this(f45678c);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f45679a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, n0.e eVar) {
        this.f45679a.onInitializeAccessibilityNodeInfo(view, eVar.f46334a);
    }

    public boolean c(View view, int i10, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i11 = 0; i11 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((n0.b) list.get(i11)).f46332a).getId() != i10; i11++) {
        }
        boolean zPerformAccessibilityAction = this.f45679a.performAccessibilityAction(view, i10, bundle);
        if (zPerformAccessibilityAction || i10 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i13 = 0; clickableSpanArr != null && i13 < clickableSpanArr.length; i13++) {
                if (clickableSpan.equals(clickableSpanArr[i13])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f45679a = accessibilityDelegate;
        this.f45680b = new a(this);
    }
}
