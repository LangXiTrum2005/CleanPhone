package lightstruck;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: ComplexColorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Shader f33003attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f33004dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ColorStateList f33005saneness;

    public wireman(Shader shader, ColorStateList colorStateList, int i) {
        this.f33003attabal = shader;
        this.f33005saneness = colorStateList;
        this.f33004dern = i;
    }

    public static wireman attabal(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
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
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return wireman(beachfront.saneness(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return dern(dern.saneness(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    public static wireman competently(Resources resources, int i, Resources.Theme theme) {
        try {
            return attabal(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    public static wireman dern(ColorStateList colorStateList) {
        return new wireman(null, colorStateList, colorStateList.getDefaultColor());
    }

    public static wireman saneness(int i) {
        return new wireman(null, null, i);
    }

    public static wireman wireman(Shader shader) {
        return new wireman(shader, null, 0);
    }

    public void apical(int i) {
        this.f33004dern = i;
    }

    public Shader beachfront() {
        return this.f33003attabal;
    }

    public boolean cutely(int[] iArr) {
        if (!taiyuan()) {
            return false;
        }
        ColorStateList colorStateList = this.f33005saneness;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f33004dern) {
            return false;
        }
        this.f33004dern = colorForState;
        return true;
    }

    public boolean formularize() {
        return impromptu() || this.f33004dern != 0;
    }

    public boolean impromptu() {
        return this.f33003attabal != null;
    }

    public int marial() {
        return this.f33004dern;
    }

    public boolean taiyuan() {
        ColorStateList colorStateList;
        return this.f33003attabal == null && (colorStateList = this.f33005saneness) != null && colorStateList.isStateful();
    }
}
