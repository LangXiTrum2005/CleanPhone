package com.facebook.internal.logging.dumpsys;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.support.v4.media.a;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.TextView;
import com.google.android.gms.ads.RequestConfiguration;
import com.p004ironsource.d9;
import com.p004ironsource.m5;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.thinkup.core.common.n.mo;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper;", "", "Api21Utils", "Api24Utils", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class EndToEndDumpsysHelper {
    public static EndToEndDumpsysHelper d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f16445e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidRootResolver f16446a = new AndroidRootResolver();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebViewDumpHelper f16447b = new WebViewDumpHelper();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f16448c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper$Api21Utils;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Api21Utils {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Field f16449a;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mKeyedTags");
                f16449a = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            } catch (NoSuchFieldException unused) {
            }
        }

        public static JSONObject a(View view) {
            String strA;
            JSONObject jSONObject = null;
            try {
                if (f16449a == null) {
                    Field declaredField = View.class.getDeclaredField("mKeyedTags");
                    f16449a = declaredField;
                    if (declaredField != null) {
                        declaredField.setAccessible(true);
                    }
                }
                Field field = f16449a;
                Object obj = field != null ? field.get(view) : null;
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.util.SparseArray<*>");
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    return null;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    int size = sparseArray.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Resources resources = view.getResources();
                        int iKeyAt = sparseArray.keyAt(i2);
                        try {
                            strA = ResourcesUtil.a(resources, iKeyAt);
                        } catch (Resources.NotFoundException unused) {
                            strA = "#" + Integer.toHexString(iKeyAt);
                        }
                        try {
                            jSONObject2.put(strA, sparseArray.valueAt(i2));
                        } catch (JSONException unused2) {
                        }
                    }
                    return jSONObject2;
                } catch (Exception unused3) {
                    jSONObject = jSONObject2;
                    return jSONObject;
                }
            } catch (Exception unused4) {
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper$Api24Utils;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Api24Utils {
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper$Companion;", "", "", "ALL_ROOTS_ARGUMENT", "Ljava/lang/String;", "E2E_ARGUMENT", "LITHO_VIEW_CLASS", "LITHO_VIEW_TEST_HELPER_CLASS", "LITHO_VIEW_TO_STRING_METHOD", "RC_TEXT_VIEW_SIMPLE_CLASS_NAME", "TOP_ROOT_ARGUMENT", "WITH_PROPS_ARGUMENT", "WITH_WEBVIEW_ARGUMENT", "Lcom/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper;", m5.f25675p, "Lcom/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper;", "Ljava/lang/reflect/Method;", "rcTextViewGetTextMethod", "Ljava/lang/reflect/Method;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final boolean a(String str, String[] strArr) {
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (str.equalsIgnoreCase(str2)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static String b(CharSequence charSequence, int i2) {
            String strI = "";
            if (charSequence != null && charSequence.length() != 0) {
                strI = StringsKt.I(StringsKt.I(StringsKt.I(charSequence.toString(), " \n", " "), IOUtils.LINE_SEPARATOR_UNIX, " "), "\"", "");
                if (charSequence.length() > i2) {
                    String strSubstring = strI.substring(0, i2);
                    Intrinsics.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    return strSubstring.concat("...");
                }
            }
            return strI;
        }

        public static boolean c(String str, PrintWriter printWriter, String[] strArr) {
            PrintWriter printWriter2;
            Exception exc;
            View view;
            if (strArr == null || strArr.length == 0 || !"e2e".equals(strArr[0])) {
                return false;
            }
            if (EndToEndDumpsysHelper.d == null) {
                EndToEndDumpsysHelper.d = new EndToEndDumpsysHelper();
            }
            EndToEndDumpsysHelper endToEndDumpsysHelper = EndToEndDumpsysHelper.d;
            if (endToEndDumpsysHelper != null) {
                printWriter.print(str);
                printWriter.println("Top Level Window View Hierarchy:");
                boolean zA = a("all-roots", strArr);
                boolean zA2 = a("top-root", strArr);
                boolean zA3 = a(d9.h.K, strArr);
                boolean zA4 = a("props", strArr);
                try {
                    ArrayList<AndroidRootResolver.Root> arrayListA = endToEndDumpsysHelper.f16446a.a();
                    if (arrayListA != null && !arrayListA.isEmpty()) {
                        Collections.reverse(arrayListA);
                        WindowManager.LayoutParams layoutParams = null;
                        for (AndroidRootResolver.Root root : arrayListA) {
                            if (root == null || (view = root.f16443a) == null || view.getVisibility() != 0) {
                                printWriter2 = printWriter;
                            } else {
                                WindowManager.LayoutParams layoutParams2 = root.f16444b;
                                if (!zA && layoutParams != null) {
                                    try {
                                        if (Math.abs(layoutParams2.type - layoutParams.type) != 1) {
                                            break;
                                        }
                                    } catch (Exception e2) {
                                        exc = e2;
                                        printWriter2 = printWriter;
                                        printWriter2.println("Failure in view hierarchy dump: " + exc.getMessage());
                                    }
                                }
                                String str2 = str + "  ";
                                View view2 = root.f16443a;
                                printWriter2 = printWriter;
                                try {
                                    endToEndDumpsysHelper.a(str2, printWriter2, view2, 0, 0, zA3, zA4);
                                    if (zA2) {
                                        endToEndDumpsysHelper.f16447b.a(printWriter2);
                                    } else {
                                        layoutParams = layoutParams2;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    exc = e;
                                    printWriter2.println("Failure in view hierarchy dump: " + exc.getMessage());
                                }
                            }
                            printWriter = printWriter2;
                        }
                        printWriter2 = printWriter;
                        endToEndDumpsysHelper.f16447b.a(printWriter2);
                    }
                } catch (Exception e4) {
                    e = e4;
                    printWriter2 = printWriter;
                }
            }
            return true;
        }

        public static void d(PrintWriter printWriter, View view) {
            Object tag = view.getTag();
            if (!(tag instanceof String)) {
                tag = null;
            }
            String str = (String) tag;
            if (str == null || str.length() == 0) {
                return;
            }
            printWriter.print(" app:tag/");
            printWriter.print(b(str, 60));
        }
    }

    /* JADX WARN: Code duplicated, block: B:172:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:175:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:179:0x040f A[Catch: Exception -> 0x0428, TryCatch #3 {Exception -> 0x0428, blocks: (B:177:0x040b, B:179:0x040f, B:182:0x042a, B:184:0x042e, B:186:0x0447, B:187:0x0453, B:188:0x0458), top: B:212:0x040b }] */
    /* JADX WARN: Code duplicated, block: B:184:0x042e A[Catch: Exception -> 0x0428, TryCatch #3 {Exception -> 0x0428, blocks: (B:177:0x040b, B:179:0x040f, B:182:0x042a, B:184:0x042e, B:186:0x0447, B:187:0x0453, B:188:0x0458), top: B:212:0x040b }] */
    /* JADX WARN: Code duplicated, block: B:186:0x0447 A[Catch: Exception -> 0x0428, EDGE_INSN: B:186:0x0447->B:191:0x0478 BREAK  A[LOOP:1: B:174:0x03fd->B:190:0x0473], TryCatch #3 {Exception -> 0x0428, blocks: (B:177:0x040b, B:179:0x040f, B:182:0x042a, B:184:0x042e, B:186:0x0447, B:187:0x0453, B:188:0x0458), top: B:212:0x040b }] */
    /* JADX WARN: Code duplicated, block: B:187:0x0453 A[Catch: Exception -> 0x0428, TryCatch #3 {Exception -> 0x0428, blocks: (B:177:0x040b, B:179:0x040f, B:182:0x042a, B:184:0x042e, B:186:0x0447, B:187:0x0453, B:188:0x0458), top: B:212:0x040b }] */
    /* JADX WARN: Code duplicated, block: B:190:0x0473 A[LOOP:1: B:174:0x03fd->B:190:0x0473, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x047a  */
    /* JADX WARN: Code duplicated, block: B:198:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:203:0x04e4 A[LOOP:2: B:202:0x04e2->B:203:0x04e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:204:0x04fa A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:212:0x040b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void a(String str, PrintWriter printWriter, View view, int i2, int i3, boolean z2, boolean z3) {
        char c2;
        int i4;
        Class<?> superclass;
        ViewGroup viewGroup;
        int childCount;
        String strM;
        int[] iArr;
        int i5;
        Object objInvoke;
        String string;
        Object tag;
        String resourcePackageName;
        EndToEndDumpsysHelper endToEndDumpsysHelper = this;
        PrintWriter printWriter2 = printWriter;
        printWriter2.print(str);
        if (view == null) {
            printWriter2.println(AbstractJsonLexerKt.NULL);
            return;
        }
        printWriter2.print(view.getClass().getName());
        printWriter2.print("{");
        printWriter2.print(Integer.toHexString(view.hashCode()));
        printWriter2.print(" ");
        int visibility = view.getVisibility();
        String str2 = mo.ono;
        if (visibility == 0) {
            printWriter2.print("V");
        } else if (visibility == 4) {
            printWriter2.print("I");
        } else if (visibility != 8) {
            printWriter2.print(mo.ono);
        } else {
            printWriter2.print(RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        }
        printWriter2.print(view.isFocusable() ? "F" : mo.ono);
        printWriter2.print(view.isEnabled() ? "E" : mo.ono);
        printWriter2.print(mo.ono);
        printWriter2.print(view.isHorizontalScrollBarEnabled() ? "H" : mo.ono);
        printWriter2.print(view.isVerticalScrollBarEnabled() ? "V" : mo.ono);
        printWriter2.print(view.isClickable() ? "C" : mo.ono);
        printWriter2.print(view.isLongClickable() ? "L" : mo.ono);
        printWriter2.print(" ");
        printWriter2.print(view.isFocused() ? "F" : mo.ono);
        printWriter2.print(view.isSelected() ? "S" : mo.ono);
        printWriter2.print(view.isHovered() ? "H" : mo.ono);
        printWriter2.print(view.isActivated() ? "A" : mo.ono);
        if (view.isDirty()) {
            str2 = "D";
        }
        printWriter2.print(str2);
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        printWriter2.print(" ");
        int i6 = 0;
        printWriter2.print(iArr2[0] - i2);
        printWriter2.print(",");
        printWriter2.print(iArr2[1] - i3);
        printWriter2.print(TokenBuilder.TOKEN_DELIMITER);
        printWriter2.print((view.getWidth() + iArr2[0]) - i2);
        printWriter2.print(",");
        printWriter2.print((view.getHeight() + iArr2[1]) - i3);
        try {
            int id = view.getId();
            if (id == -1) {
                Companion.d(printWriter, view);
            } else {
                printWriter2.append(" #");
                printWriter2.append((CharSequence) Integer.toHexString(id));
                Resources resources = view.getResources();
                if (id <= 0 || resources == null) {
                    Companion.d(printWriter, view);
                } else {
                    int i7 = (-16777216) & id;
                    if (i7 == 16777216) {
                        resourcePackageName = "android";
                    } else if (i7 != 2130706432) {
                        resourcePackageName = resources.getResourcePackageName(id);
                        Intrinsics.e(resourcePackageName, "resources.getResourcePackageName(id)");
                    } else {
                        resourcePackageName = "app";
                    }
                    printWriter2.print(" ");
                    printWriter2.print(resourcePackageName);
                    printWriter2.print(":");
                    printWriter2.print(resources.getResourceTypeName(id));
                    printWriter2.print("/");
                    printWriter2.print(resources.getResourceEntryName(id));
                }
            }
        } catch (Exception unused) {
            Companion.d(printWriter, view);
        }
        try {
            if (view instanceof TextView) {
                string = ((TextView) view).getText().toString();
            } else if (view.getClass().getSimpleName().equals("RCTextView")) {
                if (f16445e == null) {
                    f16445e = view.getClass().getDeclaredMethod("getText", new Class[0]);
                }
                Method method = f16445e;
                Object objInvoke2 = method != null ? method.invoke(view, new Object[0]) : null;
                string = objInvoke2 != null ? objInvoke2.toString() : null;
            } else {
                CharSequence contentDescription = view.getContentDescription();
                string = contentDescription != null ? contentDescription.toString() : null;
                if ((string == null || string.length() == 0) && (tag = view.getTag()) != null) {
                    String string2 = tag.toString();
                    int length = string2.length() - 1;
                    int i8 = 0;
                    boolean z4 = false;
                    while (i8 <= length) {
                        boolean z5 = Intrinsics.h(string2.charAt(!z4 ? i8 : length), 32) <= 0;
                        if (z4) {
                            if (!z5) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z5) {
                            i8++;
                        } else {
                            z4 = true;
                        }
                    }
                    string = string2.subSequence(i8, length + 1).toString();
                }
            }
            if (string != null && string.length() != 0) {
                printWriter2.print(" text=\"");
                printWriter2.print(Companion.b(string, 600));
                printWriter2.print("\"");
            }
        } catch (Exception unused2) {
        }
        if (z3) {
            Field field = Api21Utils.f16449a;
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            try {
                view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
            } catch (NullPointerException unused3) {
                if (accessibilityNodeInfoObtain != null) {
                    accessibilityNodeInfoObtain.recycle();
                }
                accessibilityNodeInfoObtain = null;
            }
            if (accessibilityNodeInfoObtain != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (view instanceof TextView) {
                        ColorStateList textColors = ((TextView) view).getTextColors();
                        c2 = 1;
                        try {
                            Intrinsics.e(textColors, "view.textColors");
                            jSONObject.put("textColor", textColors.getDefaultColor());
                            jSONObject.put("textSize", ((TextView) view).getTextSize());
                            jSONObject.put("hint", Companion.b(((TextView) view).getHint(), 100));
                        } catch (Exception e2) {
                            e = e2;
                            i4 = i6;
                            try {
                                jSONObject.put("DUMP-ERROR", Companion.b(e.getMessage(), 50));
                            } catch (JSONException unused4) {
                            }
                            printWriter2.append(" props=\"").append((CharSequence) jSONObject.toString()).append("\"");
                            printWriter2.println("}");
                            for (superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                                if (superclass.getName().equals("com.facebook.litho.LithoView")) {
                                    try {
                                        if (endToEndDumpsysHelper.f16448c == null) {
                                            endToEndDumpsysHelper.f16448c = Class.forName("com.facebook.litho.LithoViewTestHelper").getDeclaredMethod("viewToStringForE2E", View.class, Integer.TYPE, Boolean.TYPE);
                                        }
                                        Method method2 = endToEndDumpsysHelper.f16448c;
                                        objInvoke = method2 != null ? method2.invoke(null, view, Integer.valueOf((str.length() / 2) + 1), Boolean.valueOf(z3)) : null;
                                        if (objInvoke == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                        }
                                        Intrinsics.e(printWriter2.append((CharSequence) objInvoke), "writer.append(lithoViewDump)");
                                        break;
                                    } catch (Exception e3) {
                                        printWriter2.append((CharSequence) str).append("Failed litho view sub hierarch dump: ").append((CharSequence) Companion.b(e3.getMessage(), 100)).println();
                                    }
                                }
                            }
                            if (z2) {
                                WebView webView = (WebView) view;
                                final WebViewDumpHelper webViewDumpHelper = endToEndDumpsysHelper.f16447b;
                                webViewDumpHelper.getClass();
                                final WebViewDumpHelper.WebViewData webViewData = new WebViewDumpHelper.WebViewData(webView);
                                webViewDumpHelper.f16450a.add(webViewData);
                                Resources resources2 = webView.getResources();
                                Intrinsics.e(resources2, "view.resources");
                                webView.evaluateJavascript(String.format("(function() {  try {    const leftOf = %d;    const topOf = %d;    const density = %f;    const elements = Array.from(document.querySelectorAll('body, body *'));    for (const el of elements) {      const rect = el.getBoundingClientRect();      const left = Math.round(leftOf + rect.left * density);      const top = Math.round(topOf + rect.top * density);      const width = Math.round(rect.width * density);      const height = Math.round(rect.height * density);      el.setAttribute('data-rect', `${left},${top},${width},${height}`);      const style = window.getComputedStyle(el);      const hidden = style.display === 'none' || style.visibility !== 'visible' || el.getAttribute('hidden') === 'true';      const disabled = el.disabled || el.getAttribute('aria-disabled') === 'true';      const focused = el === document.activeElement;      if (hidden || disabled || focused) {        el.setAttribute('data-flag', `${hidden ? 'H' : ''}${disabled ? 'D' : ''}${focused ? 'F' : ''}`);      } else {        el.removeAttribute('data-flag');      }    }    document.activeElement.setAttribute('focused', 'true');    const doc = document.cloneNode(true);    for (const el of Array.from(doc.querySelectorAll('script, link'))) {      el.remove();    }    for (const el of Array.from(doc.querySelectorAll('*'))) {      el.removeAttribute('class');    }    return doc.getElementsByTagName('body')[0].outerHTML.trim();  } catch (e) {    return 'Failed: ' + e;  }})();", Arrays.copyOf(new Object[]{Integer.valueOf(webViewData.f16453b), Integer.valueOf(webViewData.f16454c), Float.valueOf(resources2.getDisplayMetrics().scaledDensity)}, 3)), new ValueCallback() { // from class: com.facebook.internal.logging.dumpsys.WebViewDumpHelper$handle$1
                                    @Override // android.webkit.ValueCallback
                                    public final void onReceiveValue(Object obj) {
                                        String html = (String) obj;
                                        LinkedHashMap linkedHashMap = webViewDumpHelper.f16451b;
                                        WebViewDumpHelper.WebViewData webViewData2 = webViewData;
                                        Intrinsics.e(html, "html");
                                        linkedHashMap.put(webViewData2.f16452a, html);
                                    }
                                });
                            }
                            if (view instanceof ViewGroup) {
                                strM = a.m(str, "  ");
                                iArr = new int[2];
                                view.getLocationOnScreen(iArr);
                                i5 = i4;
                                while (i5 < childCount) {
                                    endToEndDumpsysHelper.a(strM, printWriter2, viewGroup.getChildAt(i5), iArr[i4], iArr[c2], z2, z3);
                                    i5++;
                                    endToEndDumpsysHelper = this;
                                    printWriter2 = printWriter;
                                }
                            }
                            return;
                        }
                    } else {
                        c2 = 1;
                    }
                    JSONObject jSONObjectA = Api21Utils.a(view);
                    if (jSONObjectA != null) {
                        jSONObject.put("keyedTags", jSONObjectA);
                    }
                    JSONArray jSONArray = new JSONArray();
                    for (AccessibilityNodeInfo.AccessibilityAction action : accessibilityNodeInfoObtain.getActionList()) {
                        i4 = i6;
                        try {
                            Intrinsics.e(action, "action");
                            CharSequence label = action.getLabel();
                            if (label == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            jSONArray.put(Companion.b((String) label, 50));
                            i6 = i4;
                        } catch (Exception e4) {
                            e = e4;
                            jSONObject.put("DUMP-ERROR", Companion.b(e.getMessage(), 50));
                            printWriter2.append(" props=\"").append((CharSequence) jSONObject.toString()).append("\"");
                            printWriter2.println("}");
                            while (superclass != null) {
                                if (superclass.getName().equals("com.facebook.litho.LithoView")) {
                                    if (endToEndDumpsysHelper.f16448c == null) {
                                        endToEndDumpsysHelper.f16448c = Class.forName("com.facebook.litho.LithoViewTestHelper").getDeclaredMethod("viewToStringForE2E", View.class, Integer.TYPE, Boolean.TYPE);
                                    }
                                    Method method3 = endToEndDumpsysHelper.f16448c;
                                    if (method3 != null) {
                                    }
                                    if (objInvoke == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    Intrinsics.e(printWriter2.append((CharSequence) objInvoke), "writer.append(lithoViewDump)");
                                    break;
                                }
                            }
                            if (z2) {
                                WebView webView2 = (WebView) view;
                                final WebViewDumpHelper webViewDumpHelper2 = endToEndDumpsysHelper.f16447b;
                                webViewDumpHelper2.getClass();
                                final WebViewDumpHelper.WebViewData webViewData2 = new WebViewDumpHelper.WebViewData(webView2);
                                webViewDumpHelper2.f16450a.add(webViewData2);
                                Resources resources3 = webView2.getResources();
                                Intrinsics.e(resources3, "view.resources");
                                webView2.evaluateJavascript(String.format("(function() {  try {    const leftOf = %d;    const topOf = %d;    const density = %f;    const elements = Array.from(document.querySelectorAll('body, body *'));    for (const el of elements) {      const rect = el.getBoundingClientRect();      const left = Math.round(leftOf + rect.left * density);      const top = Math.round(topOf + rect.top * density);      const width = Math.round(rect.width * density);      const height = Math.round(rect.height * density);      el.setAttribute('data-rect', `${left},${top},${width},${height}`);      const style = window.getComputedStyle(el);      const hidden = style.display === 'none' || style.visibility !== 'visible' || el.getAttribute('hidden') === 'true';      const disabled = el.disabled || el.getAttribute('aria-disabled') === 'true';      const focused = el === document.activeElement;      if (hidden || disabled || focused) {        el.setAttribute('data-flag', `${hidden ? 'H' : ''}${disabled ? 'D' : ''}${focused ? 'F' : ''}`);      } else {        el.removeAttribute('data-flag');      }    }    document.activeElement.setAttribute('focused', 'true');    const doc = document.cloneNode(true);    for (const el of Array.from(doc.querySelectorAll('script, link'))) {      el.remove();    }    for (const el of Array.from(doc.querySelectorAll('*'))) {      el.removeAttribute('class');    }    return doc.getElementsByTagName('body')[0].outerHTML.trim();  } catch (e) {    return 'Failed: ' + e;  }})();", Arrays.copyOf(new Object[]{Integer.valueOf(webViewData2.f16453b), Integer.valueOf(webViewData2.f16454c), Float.valueOf(resources3.getDisplayMetrics().scaledDensity)}, 3)), new ValueCallback() { // from class: com.facebook.internal.logging.dumpsys.WebViewDumpHelper$handle$1
                                    @Override // android.webkit.ValueCallback
                                    public final void onReceiveValue(Object obj) {
                                        String html = (String) obj;
                                        LinkedHashMap linkedHashMap = webViewDumpHelper2.f16451b;
                                        WebViewDumpHelper.WebViewData webViewData3 = webViewData2;
                                        Intrinsics.e(html, "html");
                                        linkedHashMap.put(webViewData3.f16452a, html);
                                    }
                                });
                            }
                            if (view instanceof ViewGroup) {
                                return;
                            }
                            strM = a.m(str, "  ");
                            iArr = new int[2];
                            view.getLocationOnScreen(iArr);
                            i5 = i4;
                            while (i5 < childCount) {
                                endToEndDumpsysHelper.a(strM, printWriter2, viewGroup.getChildAt(i5), iArr[i4], iArr[c2], z2, z3);
                                i5++;
                                endToEndDumpsysHelper = this;
                                printWriter2 = printWriter;
                            }
                        }
                    }
                    i4 = i6;
                    if (jSONArray.length() > 0) {
                        jSONObject.put("actions", jSONArray);
                    }
                    String strB = Companion.b(accessibilityNodeInfoObtain.getContentDescription(), 50);
                    if (strB != null && strB.length() > 0) {
                        jSONObject.put("content-description", strB);
                    }
                    jSONObject.put("accessibility-focused", accessibilityNodeInfoObtain.isAccessibilityFocused()).put("checkable", accessibilityNodeInfoObtain.isCheckable()).put("checked", accessibilityNodeInfoObtain.isChecked()).put("class-name", Companion.b(accessibilityNodeInfoObtain.getClassName(), 50)).put("clickable", accessibilityNodeInfoObtain.isClickable()).put("content-invalid", accessibilityNodeInfoObtain.isContentInvalid()).put("dismissable", accessibilityNodeInfoObtain.isDismissable()).put("editable", accessibilityNodeInfoObtain.isEditable()).put("enabled", accessibilityNodeInfoObtain.isEnabled()).put("focusable", accessibilityNodeInfoObtain.isFocusable()).put("focused", accessibilityNodeInfoObtain.isFocused()).put("long-clickable", accessibilityNodeInfoObtain.isLongClickable()).put("multiline", accessibilityNodeInfoObtain.isMultiLine()).put("password", accessibilityNodeInfoObtain.isPassword()).put("scrollable", accessibilityNodeInfoObtain.isScrollable()).put("selected", accessibilityNodeInfoObtain.isSelected()).put("visible-to-user", accessibilityNodeInfoObtain.isVisibleToUser());
                    jSONObject.put("context-clickable", accessibilityNodeInfoObtain.isContextClickable()).put("drawing-order", accessibilityNodeInfoObtain.getDrawingOrder()).put("important-for-accessibility", accessibilityNodeInfoObtain.isImportantForAccessibility());
                } catch (Exception e5) {
                    e = e5;
                    c2 = 1;
                }
                printWriter2.append(" props=\"").append((CharSequence) jSONObject.toString()).append("\"");
            } else {
                c2 = 1;
                i4 = 0;
            }
        } else {
            c2 = 1;
            i4 = 0;
        }
        printWriter2.println("}");
        while (superclass != null) {
            if (superclass.getName().equals("com.facebook.litho.LithoView")) {
                if (endToEndDumpsysHelper.f16448c == null) {
                    endToEndDumpsysHelper.f16448c = Class.forName("com.facebook.litho.LithoViewTestHelper").getDeclaredMethod("viewToStringForE2E", View.class, Integer.TYPE, Boolean.TYPE);
                }
                Method method4 = endToEndDumpsysHelper.f16448c;
                if (method4 != null) {
                }
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                Intrinsics.e(printWriter2.append((CharSequence) objInvoke), "writer.append(lithoViewDump)");
                break;
            }
        }
        if (z2 && (view instanceof WebView)) {
            WebView webView3 = (WebView) view;
            final WebViewDumpHelper webViewDumpHelper3 = endToEndDumpsysHelper.f16447b;
            webViewDumpHelper3.getClass();
            final WebViewDumpHelper.WebViewData webViewData3 = new WebViewDumpHelper.WebViewData(webView3);
            webViewDumpHelper3.f16450a.add(webViewData3);
            Resources resources4 = webView3.getResources();
            Intrinsics.e(resources4, "view.resources");
            webView3.evaluateJavascript(String.format("(function() {  try {    const leftOf = %d;    const topOf = %d;    const density = %f;    const elements = Array.from(document.querySelectorAll('body, body *'));    for (const el of elements) {      const rect = el.getBoundingClientRect();      const left = Math.round(leftOf + rect.left * density);      const top = Math.round(topOf + rect.top * density);      const width = Math.round(rect.width * density);      const height = Math.round(rect.height * density);      el.setAttribute('data-rect', `${left},${top},${width},${height}`);      const style = window.getComputedStyle(el);      const hidden = style.display === 'none' || style.visibility !== 'visible' || el.getAttribute('hidden') === 'true';      const disabled = el.disabled || el.getAttribute('aria-disabled') === 'true';      const focused = el === document.activeElement;      if (hidden || disabled || focused) {        el.setAttribute('data-flag', `${hidden ? 'H' : ''}${disabled ? 'D' : ''}${focused ? 'F' : ''}`);      } else {        el.removeAttribute('data-flag');      }    }    document.activeElement.setAttribute('focused', 'true');    const doc = document.cloneNode(true);    for (const el of Array.from(doc.querySelectorAll('script, link'))) {      el.remove();    }    for (const el of Array.from(doc.querySelectorAll('*'))) {      el.removeAttribute('class');    }    return doc.getElementsByTagName('body')[0].outerHTML.trim();  } catch (e) {    return 'Failed: ' + e;  }})();", Arrays.copyOf(new Object[]{Integer.valueOf(webViewData3.f16453b), Integer.valueOf(webViewData3.f16454c), Float.valueOf(resources4.getDisplayMetrics().scaledDensity)}, 3)), new ValueCallback() { // from class: com.facebook.internal.logging.dumpsys.WebViewDumpHelper$handle$1
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    String html = (String) obj;
                    LinkedHashMap linkedHashMap = webViewDumpHelper3.f16451b;
                    WebViewDumpHelper.WebViewData webViewData4 = webViewData3;
                    Intrinsics.e(html, "html");
                    linkedHashMap.put(webViewData4.f16452a, html);
                }
            });
        }
        if ((view instanceof ViewGroup) && (childCount = (viewGroup = (ViewGroup) view).getChildCount()) > 0) {
            strM = a.m(str, "  ");
            iArr = new int[2];
            view.getLocationOnScreen(iArr);
            i5 = i4;
            while (i5 < childCount) {
                endToEndDumpsysHelper.a(strM, printWriter2, viewGroup.getChildAt(i5), iArr[i4], iArr[c2], z2, z3);
                i5++;
                endToEndDumpsysHelper = this;
                printWriter2 = printWriter;
            }
        }
    }
}
