package org.luxoft.tutor.maze.domain;

import org.luxoft.tutor.maze.api.Maze;
import org.luxoft.tutor.maze.api.Room;

public class MazeImpl extends Maze {

    public MazeImpl() {
		super();
    }

    @Override
    public Room makeRoom(final int number) {
        Room room = new RoomImpl(number);
        addRoom(room);
        return room;
    }

}
