package org.metable.trek.sandbox.type.linesegment;

import org.metable.trek.sandbox.type.point.Point;

/**
 * <code>
 *  
 * TYPE LineSegment
 *     POSSREP (begin Point, end Point);  
 * </code>
 */
public class LineSegment {

    private static class LineSegmentPossRep {
        Point begin;
        Point end;

        LineSegmentPossRep(Point begin, Point end) {
            this.begin = begin;
            this.end = end;
        }
    }

    private LineSegmentPossRep lineSegmentPossRep;

    private LineSegment() {
    }

    public static LineSegment lineSegmentPossRep(Point begin, Point end) {
        LineSegment lineSegment = new LineSegment();
        lineSegment.lineSegmentPossRep = new LineSegmentPossRep(Point.point(begin), Point.point(end));

        return lineSegment;
    }

    public static LineSegment lineSegment(LineSegment lineSegment) {
        return lineSegmentPossRep(lineSegment.lineSegmentPossRep.begin, lineSegment.lineSegmentPossRep.end);
    }
}
