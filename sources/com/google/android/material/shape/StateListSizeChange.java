package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import bubbles.dern;
import bubbles.impassible;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class StateListSizeChange {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f20882attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public attabal f20884saneness;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int[][] f20883dern = new int[10][];

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public attabal[] f20885wireman = new attabal[10];

    public enum SizeChangeType {
        PERCENT,
        PIXELS
    }

    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public saneness f20887attabal;

        public attabal(saneness sanenessVar) {
            this.f20887attabal = sanenessVar;
        }
    }

    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public SizeChangeType f20888attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public float f20889saneness;

        public saneness(SizeChangeType sizeChangeType, float f) {
            this.f20888attabal = sizeChangeType;
            this.f20889saneness = f;
        }

        public int attabal(int i) {
            SizeChangeType sizeChangeType = this.f20888attabal;
            if (sizeChangeType == SizeChangeType.PERCENT) {
                return (int) (this.f20889saneness * i);
            }
            if (sizeChangeType == SizeChangeType.PIXELS) {
                return (int) this.f20889saneness;
            }
            return 0;
        }
    }

    public static StateListSizeChange saneness(Context context, TypedArray typedArray, int i) {
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return null;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                StateListSizeChange stateListSizeChange = new StateListSizeChange();
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    stateListSizeChange.impromptu(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return stateListSizeChange;
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            return null;
        }
    }

    public final void attabal(int[] iArr, attabal attabalVar) {
        int i = this.f20882attabal;
        if (i == 0 || iArr.length == 0) {
            this.f20884saneness = attabalVar;
        }
        if (i >= this.f20883dern.length) {
            beachfront(i, i + 10);
        }
        int[][] iArr2 = this.f20883dern;
        int i2 = this.f20882attabal;
        iArr2[i2] = iArr;
        this.f20885wireman[i2] = attabalVar;
        this.f20882attabal = i2 + 1;
    }

    public final void beachfront(int i, int i2) {
        int[][] iArr = new int[i2][];
        System.arraycopy(this.f20883dern, 0, iArr, 0, i);
        this.f20883dern = iArr;
        attabal[] attabalVarArr = new attabal[i2];
        System.arraycopy(this.f20885wireman, 0, attabalVarArr, 0, i);
        this.f20885wireman = attabalVarArr;
    }

    public final int competently(int[] iArr) {
        int[][] iArr2 = this.f20883dern;
        for (int i = 0; i < this.f20882attabal; i++) {
            if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    public int dern(int i) {
        float fMax;
        int i2 = -i;
        for (int i3 = 0; i3 < this.f20882attabal; i3++) {
            saneness sanenessVar = this.f20885wireman[i3].f20887attabal;
            SizeChangeType sizeChangeType = sanenessVar.f20888attabal;
            if (sizeChangeType == SizeChangeType.PIXELS) {
                fMax = Math.max(i2, sanenessVar.f20889saneness);
            } else {
                if (sizeChangeType == SizeChangeType.PERCENT) {
                    fMax = Math.max(i2, i * sanenessVar.f20889saneness);
                }
            }
            i2 = (int) fMax;
        }
        return i2;
    }

    public final void impromptu(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, impassible.StateListSizeChange) : theme.obtainStyledAttributes(attributeSet, impassible.StateListSizeChange, 0, 0);
                saneness sanenessVarWireman = wireman(typedArrayObtainAttributes, impassible.StateListSizeChange_widthChange, null);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != dern.widthChange) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i] = attributeNameResource;
                        i = i3;
                    }
                }
                attabal(StateSet.trimStateSet(iArr, i), new attabal(sanenessVarWireman));
            }
        }
    }

    public attabal marial(int[] iArr) {
        int iCompetently = competently(iArr);
        if (iCompetently < 0) {
            iCompetently = competently(StateSet.WILD_CARD);
        }
        return iCompetently < 0 ? this.f20884saneness : this.f20885wireman[iCompetently];
    }

    public final saneness wireman(TypedArray typedArray, int i, saneness sanenessVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new saneness(SizeChangeType.PIXELS, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new saneness(SizeChangeType.PERCENT, typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return sanenessVar;
    }
}
