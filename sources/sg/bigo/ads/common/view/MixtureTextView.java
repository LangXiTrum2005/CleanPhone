package sg.bigo.ads.common.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public class MixtureTextView extends RelativeLayout {
    private static int[] s = {R.attr.textSize, R.attr.textColor, R.attr.text};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Layout f47580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47582c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f47583e;
    private TextPaint f;
    private List<List<Rect>> g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<Integer> f47584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<Layout> f47585i;
    private List<Integer> j;
    private HashSet<Integer> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f47586l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f47587n;
    private int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f47588p;
    private boolean q;
    private int r;
    private Map<Integer, Point> t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private a f47589u;
    private boolean v;

    public interface a {
        void a(UnderlineSpan underlineSpan);
    }

    public MixtureTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47580a = null;
        this.f47582c = -9601400;
        this.g = new ArrayList();
        this.f47584h = null;
        this.f47585i = new ArrayList();
        this.j = new ArrayList();
        this.k = new HashSet<>();
        this.t = new HashMap();
        this.v = true;
        this.d = e.b(getContext(), 14);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.d);
        this.f47582c = typedArrayObtainStyledAttributes.getColor(1, this.f47582c);
        this.f47583e = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        textPaint.setDither(true);
        this.f.setAntiAlias(true);
        this.f.setColor(this.f47582c);
        if (TextUtils.isEmpty(this.f47583e)) {
            return;
        }
        this.q = true;
    }

    private static CharSequence a(CharSequence charSequence, int i2, int i3) {
        if (q.a(charSequence)) {
            return null;
        }
        if (!(charSequence instanceof SpannableString)) {
            if (charSequence instanceof String) {
                return ((String) charSequence).substring(i2, i3);
            }
            return null;
        }
        SpannableString spannableString = (SpannableString) charSequence;
        SpannableString spannableString2 = new SpannableString(TextUtils.substring(spannableString, i2, i3));
        Object[] spans = spannableString.getSpans(i2, i3, Object.class);
        for (int length = spans.length - 1; length >= 0; length--) {
            Object obj = spans[length];
            int spanStart = spannableString.getSpanStart(obj) - i2;
            int spanEnd = spannableString.getSpanEnd(obj) - i2;
            try {
                int length2 = spannableString2.length();
                if (spanEnd >= spanStart && spanStart <= length2 && spanEnd <= length2 && spanStart >= 0) {
                    spannableString2.setSpan(obj, spanStart, spanEnd, 33);
                }
            } catch (Exception unused) {
            }
        }
        return spannableString2;
    }

    private static void b(Rect rect, List<Rect> list, int i2, int i3, int i4) {
        if (rect.left > i4) {
            list.add(new Rect(i4, i2, rect.left, i3));
        }
    }

    private void getAllYCors() {
        int i2 = this.f47581b;
        HashSet<Integer> hashSet = this.k;
        hashSet.clear();
        this.t.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                childAt.getTop();
                int paddingTop = getPaddingTop() + (((childAt.getTop() - getPaddingTop()) / i2) * i2);
                hashSet.add(Integer.valueOf(paddingTop));
                int bottom = childAt.getBottom() - getPaddingTop();
                if (bottom % i2 != 0) {
                    bottom = ((bottom / i2) + 1) * i2;
                }
                int paddingTop2 = getPaddingTop() + bottom;
                hashSet.add(Integer.valueOf(paddingTop2));
                this.t.put(Integer.valueOf(i3), new Point(paddingTop, paddingTop2));
            }
        }
        hashSet.add(Integer.valueOf(getPaddingTop()));
        hashSet.add(Integer.valueOf(this.f47587n == 1073741824 ? getHeight() : Integer.MAX_VALUE));
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        this.f47584h = arrayList;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.f47586l = getPaddingTop() + getPaddingBottom();
        int i2 = this.f47581b;
        List list = this.g;
        List<Integer> list2 = this.f47584h;
        list.clear();
        if (list2 != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = 1;
                if (i4 >= list2.size() - 1) {
                    break;
                }
                int iIntValue = list2.get(i4).intValue();
                i4++;
                int iIntValue2 = list2.get(i4).intValue();
                ArrayList arrayList = new ArrayList();
                List<Rect> listA = a(iIntValue, iIntValue2);
                int size = listA.size();
                if (size == 0) {
                    arrayList.add(new Rect(paddingLeft, iIntValue, width, iIntValue2));
                } else if (size != 1) {
                    b(listA.get(i3), arrayList, iIntValue, iIntValue2, paddingLeft);
                    int i6 = i3;
                    while (i6 < listA.size() - i5) {
                        Rect rect = listA.get(i6);
                        i6++;
                        Rect rect2 = listA.get(i6);
                        if (rect.right < rect2.left) {
                            arrayList.add(new Rect(rect.right, iIntValue, rect2.left, iIntValue2));
                        }
                        i5 = 1;
                    }
                    a((Rect) androidx.media3.extractor.text.ttml.a.h(i5, listA), arrayList, iIntValue, iIntValue2, width);
                } else {
                    Rect rect3 = listA.get(i3);
                    b(rect3, arrayList, iIntValue, iIntValue2, paddingLeft);
                    a(rect3, arrayList, iIntValue, iIntValue2, width);
                }
                list.add(arrayList);
                i3 = 0;
            }
            ArrayList arrayList2 = new ArrayList(list);
            int size2 = list.size();
            int i7 = 0;
            int i8 = 0;
            while (i8 < size2) {
                List list3 = (List) list.get(i8);
                if (list3.size() > 1) {
                    int i9 = i7 + i8;
                    arrayList2.remove(list3);
                    i7--;
                    int i10 = 0;
                    Rect rect4 = (Rect) list3.get(0);
                    int iHeight = rect4.height() / i2;
                    this.f47586l -= ((list3.size() - 1) * iHeight) * i2;
                    int i11 = i9;
                    int i12 = 0;
                    while (i12 < iHeight) {
                        int i13 = i11;
                        int i14 = i10;
                        while (i14 < list3.size()) {
                            i7++;
                            int i15 = i2;
                            int i16 = i15 * i12;
                            arrayList2.add(i13, Arrays.asList(new Rect(((Rect) list3.get(i14)).left, rect4.top + i16, ((Rect) list3.get(i14)).right, rect4.top + i16 + i15)));
                            i14++;
                            i13++;
                            i2 = i15;
                            size2 = size2;
                            list = list;
                        }
                        i12++;
                        i11 = i13;
                        i10 = 0;
                    }
                }
                i8++;
                i2 = i2;
                size2 = size2;
                list = list;
            }
            this.g = arrayList2;
        }
        if (a(null)) {
            return;
        }
        a(canvas);
        super.dispatchDraw(canvas);
    }

    public CharSequence getText() {
        return this.f47583e;
    }

    public int getTextColor() {
        return this.f47582c;
    }

    public int getTextSize() {
        return this.d;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int offsetForHorizontal;
        a aVar;
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0 && q.b(this.f47583e)) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (this.f47585i.isEmpty() || this.j.isEmpty()) {
                offsetForHorizontal = 0;
            } else {
                offsetForHorizontal = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < this.f47585i.size(); i3++) {
                    Layout layout = this.f47585i.get(i3);
                    int iIntValue = this.j.get(i3).intValue();
                    if (layout != null) {
                        int lineForVertical = layout.getLineForVertical(y);
                        if (lineForVertical + 1 <= iIntValue) {
                            offsetForHorizontal += layout.getOffsetForHorizontal(Math.min(lineForVertical, layout.getLineCount() - 1), x);
                            break;
                        }
                        i2 += iIntValue;
                        y -= this.f47581b * i2;
                        offsetForHorizontal += layout.getLineEnd(iIntValue - 1);
                    }
                }
            }
            if (offsetForHorizontal < this.f47583e.length()) {
                CharSequence charSequence = this.f47583e;
                if (charSequence instanceof SpannableString) {
                    UnderlineSpan[] underlineSpanArr = (UnderlineSpan[]) ((SpannableString) charSequence).getSpans(offsetForHorizontal, offsetForHorizontal, UnderlineSpan.class);
                    if (underlineSpanArr.length > 0 && (aVar = this.f47589u) != null) {
                        aVar.a(underlineSpanArr[0]);
                        return true;
                    }
                }
            }
        }
        return zOnInterceptTouchEvent;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (this.v) {
            this.f47587n = View.MeasureSpec.getMode(this.m);
            this.v = false;
            this.r = getMeasuredHeight();
        }
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.q) {
            getAllYCors();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        if (!this.q) {
            super.onMeasure(i2, i3);
            return;
        }
        this.m = i3;
        this.f.setTextSize(this.d);
        StaticLayout staticLayout = new StaticLayout("测量行高", this.f, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f47580a = staticLayout;
        this.f47581b = staticLayout.getLineBottom(0) - this.f47580a.getLineTop(0);
        if (this.f47588p) {
            super.onMeasure(i2, this.o);
        } else {
            super.onMeasure(i2, i3);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setClickListener(a aVar) {
        this.f47589u = aVar;
    }

    public void setText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.q = false;
            requestLayout();
        } else {
            this.q = true;
            this.f47583e = charSequence;
            requestLayout();
            invalidate();
        }
    }

    public void setTextColor(int i2) {
        this.f.setColor(i2);
        this.f47582c = i2;
        invalidate();
    }

    public void setTextSize(int i2) {
        this.d = i2;
        this.f.setTextSize(i2);
        requestLayout();
        invalidate();
    }

    private List<Rect> a(int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            Point point = this.t.get(Integer.valueOf(i4));
            int i5 = point.x;
            int i6 = point.y;
            if (i5 <= i2 && i6 >= i3) {
                arrayList.add(new Rect(childAt.getLeft(), i2, childAt.getRight(), i3));
            }
        }
        Collections.sort(arrayList, new Comparator<Rect>() { // from class: sg.bigo.ads.common.view.MixtureTextView.1
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Rect rect, Rect rect2) {
                return rect.left > rect2.left ? 1 : -1;
            }
        });
        if (arrayList.size() < 2) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Rect rect = (Rect) arrayList.get(0);
        Rect rect2 = (Rect) arrayList.get(1);
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            if (!Rect.intersects(rect, rect2)) {
                if (arrayList2.size() - i7 < 2) {
                    break;
                }
                Rect rect3 = rect2;
                rect2 = (Rect) arrayList.get(i7 + 1);
                rect = rect3;
            } else {
                int iMin = Math.min(rect.left, rect2.left);
                int iMax = Math.max(rect.right, rect2.right);
                arrayList2.remove(rect);
                arrayList2.remove(rect2);
                arrayList2.add(new Rect(iMin, i2, iMax, i3));
                if (arrayList2.size() < 2) {
                    break;
                }
                rect = (Rect) arrayList.get(0);
                rect2 = (Rect) arrayList.get(1);
            }
        }
        return arrayList2;
    }

    private static void a(Rect rect, List<Rect> list, int i2, int i3, int i4) {
        if (rect.right < i4) {
            list.add(new Rect(rect.right, i2, i4, i3));
        }
    }

    private boolean a(Canvas canvas) {
        boolean z2 = canvas == null;
        int i2 = this.f47581b;
        List<List<Rect>> list = this.g;
        CharSequence charSequence = this.f47583e;
        int length = charSequence != null ? charSequence.length() : 0;
        int lineEnd = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            Rect rect = list.get(i4).get(0);
            int iWidth = rect.width();
            int iHeight = rect.height();
            CharSequence charSequenceA = a(this.f47583e, lineEnd, length);
            StaticLayout staticLayout = (q.a(charSequenceA) || this.f == null) ? null : new StaticLayout(charSequenceA, this.f, iWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f47580a = staticLayout;
            if (staticLayout != null) {
                int iMin = Math.min(staticLayout.getLineCount(), iHeight / i2);
                if (!z2) {
                    canvas.save();
                    canvas.translate(rect.left, rect.top);
                    canvas.clipRect(0, 0, rect.width(), this.f47580a.getLineBottom(iMin - 1) - this.f47580a.getLineTop(0));
                    this.f47580a.draw(canvas);
                    canvas.restore();
                }
                lineEnd += this.f47580a.getLineEnd(iMin - 1);
                if (canvas != null) {
                    this.f47585i.add(this.f47580a);
                    this.j.add(Integer.valueOf(iMin));
                }
                i3 += iMin;
                if (lineEnd >= length) {
                    break;
                }
            }
        }
        if (z2) {
            int i5 = (i3 * i2) + this.f47586l;
            this.f47586l = i5;
            if (i5 > this.r) {
                int height = getHeight();
                int i6 = this.f47586l;
                if (height != i6 && this.f47587n != 1073741824) {
                    this.o = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                    this.f47588p = true;
                    requestLayout();
                    return true;
                }
            }
        }
        return false;
    }
}
