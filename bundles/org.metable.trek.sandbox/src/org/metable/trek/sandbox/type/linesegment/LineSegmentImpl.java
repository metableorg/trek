package org.metable.trek.sandbox.type.linesegment;

import org.metable.trek.sandbox.type.point.Point;

public class LineSegmentImpl implements LineSegment {

    static class LineSegment {
        static boolean constraint(LineSegment lineSegment) {
            return (!(lineSegment.begin.isEqual(lineSegment.end)));
        }

        Point begin;

        Point end;

        LineSegment(Point begin, Point end) {
            this.begin = Point.point(begin);
            this.end = Point.point(end);
            assert (constraint(this));
        }
    }

    LineSegment rep;

    @Override
    public Point getBegin() {
        return Point.point(rep.begin);
    }

    @Override
    public Point getEnd() {
        return Point.point(rep.end);
    }

    @Override
    public void setBegin(Point begin) {
        rep = new LineSegment(begin, rep.end);
    }

    @Override
    public void setEnd(Point end) {
        rep = new LineSegment(rep.begin, end);
    }
}
