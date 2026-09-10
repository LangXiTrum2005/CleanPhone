package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.p004ironsource.d9;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DeclarationDescriptorImpl extends AnnotatedImpl implements DeclarationDescriptor {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Name f43633Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeclarationDescriptorImpl(Annotations annotations, Name name) {
        super(annotations);
        if (annotations == null) {
            Z(0);
            throw null;
        }
        if (name == null) {
            Z(1);
            throw null;
        }
        this.f43633Y = name;
    }

    public static /* synthetic */ void Z(int i2) {
        String str = (i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6) ? 2 : 3];
        switch (i2) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i2 == 2) {
            objArr[1] = "getName";
        } else if (i2 == 3) {
            objArr[1] = "getOriginal";
        } else if (i2 == 5 || i2 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i2 != 2 && i2 != 3) {
            if (i2 == 4) {
                objArr[2] = "toString";
            } else if (i2 != 5 && i2 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i2 != 2 && i2 != 3 && i2 != 5 && i2 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String c0(DeclarationDescriptor declarationDescriptor) {
        try {
            String str = DescriptorRenderer.f44239c.x(declarationDescriptor) + d9.i.d + declarationDescriptor.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(declarationDescriptor)) + d9.i.f24752e;
            if (str != null) {
                return str;
            }
            Z(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = declarationDescriptor.getClass().getSimpleName() + " " + declarationDescriptor.getName();
            if (str2 != null) {
                return str2;
            }
            Z(6);
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public DeclarationDescriptor y0() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public final Name getName() {
        Name name = this.f43633Y;
        if (name != null) {
            return name;
        }
        Z(2);
        throw null;
    }

    public String toString() {
        return c0(this);
    }
}
