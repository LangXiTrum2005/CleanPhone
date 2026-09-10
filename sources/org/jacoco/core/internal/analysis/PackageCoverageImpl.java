package org.jacoco.core.internal.analysis;

import java.util.Collection;
import org.jacoco.core.analysis.CoverageNodeImpl;
import org.jacoco.core.analysis.IClassCoverage;
import org.jacoco.core.analysis.ICoverageNode;
import org.jacoco.core.analysis.IPackageCoverage;
import org.jacoco.core.analysis.ISourceFileCoverage;

/* JADX INFO: loaded from: classes5.dex */
public class PackageCoverageImpl extends CoverageNodeImpl implements IPackageCoverage {
    private final Collection<IClassCoverage> classes;
    private final Collection<ISourceFileCoverage> sourceFiles;

    public PackageCoverageImpl(String str, Collection<IClassCoverage> collection2, Collection<ISourceFileCoverage> collection3) {
        super(ICoverageNode.ElementType.PACKAGE, str);
        this.classes = collection2;
        this.sourceFiles = collection3;
        increment(collection3);
        for (IClassCoverage iClassCoverage : collection2) {
            if (iClassCoverage.getSourceFileName() == null) {
                increment(iClassCoverage);
            }
        }
    }

    @Override // org.jacoco.core.analysis.IPackageCoverage
    public Collection<IClassCoverage> getClasses() {
        return this.classes;
    }

    @Override // org.jacoco.core.analysis.IPackageCoverage
    public Collection<ISourceFileCoverage> getSourceFiles() {
        return this.sourceFiles;
    }
}
