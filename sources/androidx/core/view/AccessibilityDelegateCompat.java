package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.charging.screenshow.battery.animations.themes.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f4416c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f4417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View.AccessibilityDelegate f4418b;

    public static final class AccessibilityDelegateAdapter extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccessibilityDelegateCompat f4419a;

        public AccessibilityDelegateAdapter(AccessibilityDelegateCompat accessibilityDelegateCompat) {
            this.f4419a = accessibilityDelegateCompat;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f4419a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            AccessibilityNodeProviderCompat accessibilityNodeProviderCompatB = this.f4419a.b(view);
            if (accessibilityNodeProviderCompatB != null) {
                return accessibilityNodeProviderCompatB.f4546a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4419a.c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            int iKeyAt;
            int i2 = 1;
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            int i3 = 0;
            Boolean bool = (Boolean) new ViewCompat.AnonymousClass1(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28).c(view);
            boolean z2 = bool != null && bool.booleanValue();
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z2);
            } else {
                accessibilityNodeInfoCompat.i(1, z2);
            }
            Boolean bool2 = (Boolean) new ViewCompat.AnonymousClass4(R.id.tag_accessibility_heading, Boolean.class, 0, 28).c(view);
            boolean z3 = bool2 != null && bool2.booleanValue();
            if (i4 >= 28) {
                accessibilityNodeInfo.setHeading(z3);
            } else {
                accessibilityNodeInfoCompat.i(2, z3);
            }
            CharSequence charSequenceG = ViewCompat.g(view);
            if (i4 >= 28) {
                accessibilityNodeInfo.setPaneTitle(charSequenceG);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceG);
            }
            accessibilityNodeInfoCompat.p((CharSequence) new ViewCompat.AnonymousClass3(R.id.tag_state_description, CharSequence.class, 64, 30).c(view));
            this.f4419a.d(view, accessibilityNodeInfoCompat);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i4 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                        if (((WeakReference) sparseArray.valueAt(i5)).get() == null) {
                            arrayList.add(Integer.valueOf(i5));
                        }
                    }
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        sparseArray.remove(((Integer) arrayList.get(i6)).intValue());
                    }
                }
                ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
                if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    int i7 = 0;
                    while (i7 < clickableSpanArr.length) {
                        ClickableSpan clickableSpan = clickableSpanArr[i7];
                        int i8 = i3;
                        while (true) {
                            if (i8 >= sparseArray2.size()) {
                                iKeyAt = AccessibilityNodeInfoCompat.f4533c;
                                AccessibilityNodeInfoCompat.f4533c = iKeyAt + 1;
                                break;
                            } else {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i8)).get())) {
                                    iKeyAt = sparseArray2.keyAt(i8);
                                    break;
                                }
                                i8 += i2;
                            }
                        }
                        sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArr[i7]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i7];
                        Spanned spanned = (Spanned) text;
                        accessibilityNodeInfoCompat.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        accessibilityNodeInfoCompat.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        accessibilityNodeInfoCompat.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        accessibilityNodeInfoCompat.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                        i7++;
                        i2 = i2;
                        i3 = 0;
                    }
                }
            }
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            for (int i9 = 0; i9 < list.size(); i9++) {
                accessibilityNodeInfoCompat.b((AccessibilityNodeInfoCompat.AccessibilityActionCompat) list.get(i9));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4419a.e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f4419a.f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.f4419a.g(view, i2, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i2) {
            this.f4419a.h(view, i2);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f4419a.i(view, accessibilityEvent);
        }
    }

    public AccessibilityDelegateCompat() {
        this(f4416c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f4417a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public AccessibilityNodeProviderCompat b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f4417a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new AccessibilityNodeProviderCompat(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f4417a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.f4417a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f4534a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f4417a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f4417a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i2, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            if (i3 < list.size()) {
                AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = (AccessibilityNodeInfoCompat.AccessibilityActionCompat) list.get(i3);
                if (accessibilityActionCompat.a() == i2) {
                    AccessibilityViewCommand accessibilityViewCommand = accessibilityActionCompat.d;
                    if (accessibilityViewCommand != null) {
                        Class cls = accessibilityActionCompat.f4543c;
                        if (cls != null) {
                            try {
                                ((AccessibilityViewCommand.CommandArguments) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).getClass();
                            } catch (Exception e2) {
                                Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e2);
                            }
                        }
                        zPerformAccessibilityAction = accessibilityViewCommand.d(view);
                        break;
                    }
                } else {
                    i3++;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f4417a.performAccessibilityAction(view, i2, bundle);
        }
        if (zPerformAccessibilityAction || i2 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i4 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i4)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i5 = 0; clickableSpanArr != null && i5 < clickableSpanArr.length; i5++) {
                if (clickableSpan.equals(clickableSpanArr[i5])) {
                    clickableSpan.onClick(view);
                    z2 = true;
                    break;
                }
            }
        }
        return z2;
    }

    public void h(View view, int i2) {
        this.f4417a.sendAccessibilityEvent(view, i2);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f4417a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public AccessibilityDelegateCompat(View.AccessibilityDelegate accessibilityDelegate) {
        this.f4417a = accessibilityDelegate;
        this.f4418b = new AccessibilityDelegateAdapter(this);
    }
}
