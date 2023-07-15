package org.metable.trek.sandbox.type.linesegment;

import org.metable.trek.sandbox.type.point.Point;

public class LineSegmentImpl implements LineSegment {

    static class LineSegment {
        static boolean constraint(LineSegment lineSegment) {
            return (!lineSegment.begin.is_equal(lineSegment.end));
        }
        Point begin;

        Point end;

        LineSegment(Point begin, Point end) {
            this.begin = Point.point(begin);
            this.end = Point.point(end);
        }
    }

    LineSegment rep;

    Point getBegin() {
        return Point.point(rep.begin);
    }

    Point getEnd() {
        return Point.point(rep.end);
    }

    void setBegin(Point begin) {
        rep.begin = Point.point(begin);
        assert (LineSegment.constraint(rep));
    }

    void setEnd(Point end) {
        rep.end = Point.point(end);
        assert (LineSegment.constraint(rep));
    }
}
