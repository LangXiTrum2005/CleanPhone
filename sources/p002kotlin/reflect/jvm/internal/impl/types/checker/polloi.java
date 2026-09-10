package p002kotlin.reflect.jvm.internal.impl.types.checker;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;

/* JADX INFO: compiled from: TypeCheckerProcedureCallbacksImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class polloi implements graveside {
    public static /* synthetic */ void saneness(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B;
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.checker.graveside
    public boolean attabal(permissivist permissivistVar, permissivist permissivistVar2) {
        if (permissivistVar == null) {
            saneness(3);
        }
        if (permissivistVar2 == null) {
            saneness(4);
        }
        return permissivistVar.equals(permissivistVar2);
    }
}
