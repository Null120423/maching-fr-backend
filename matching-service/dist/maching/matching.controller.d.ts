export declare class MatchingController {
    findMatches(data: {
        activity: string;
        location: string;
    }): {
        matches: {
            id: string;
            name: string;
            activity: string;
        }[];
    };
}
