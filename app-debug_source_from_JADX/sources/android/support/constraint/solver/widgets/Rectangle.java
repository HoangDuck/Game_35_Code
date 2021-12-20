package android.support.constraint.solver.widgets;

public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x */
    public int f33x;

    /* renamed from: y */
    public int f34y;

    public void setBounds(int x, int y, int width2, int height2) {
        this.f33x = x;
        this.f34y = y;
        this.width = width2;
        this.height = height2;
    }

    /* access modifiers changed from: package-private */
    public void grow(int w, int h) {
        this.f33x -= w;
        this.f34y -= h;
        this.width += w * 2;
        this.height += h * 2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = r3.f34y;
        r1 = r4.f34y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean intersects(android.support.constraint.solver.widgets.Rectangle r4) {
        /*
            r3 = this;
            int r0 = r3.f33x
            int r1 = r4.f33x
            if (r0 < r1) goto L_0x0018
            int r2 = r4.width
            int r1 = r1 + r2
            if (r0 >= r1) goto L_0x0018
            int r0 = r3.f34y
            int r1 = r4.f34y
            if (r0 < r1) goto L_0x0018
            int r2 = r4.height
            int r1 = r1 + r2
            if (r0 >= r1) goto L_0x0018
            r0 = 1
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.Rectangle.intersects(android.support.constraint.solver.widgets.Rectangle):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r0 = r2.f34y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean contains(int r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.f33x
            if (r3 < r0) goto L_0x0014
            int r1 = r2.width
            int r0 = r0 + r1
            if (r3 >= r0) goto L_0x0014
            int r0 = r2.f34y
            if (r4 < r0) goto L_0x0014
            int r1 = r2.height
            int r0 = r0 + r1
            if (r4 >= r0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.Rectangle.contains(int, int):boolean");
    }

    public int getCenterX() {
        return (this.f33x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f34y + this.height) / 2;
    }
}
