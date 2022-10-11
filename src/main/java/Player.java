public class Player {
    private Room currentRoom;
    public Room getCurrentRoom() {
        return currentRoom;
    }
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public boolean goNorth() {
        if (currentRoom.getNorth() == null) {
            return false;
        } else {
            setCurrentRoom((currentRoom.getNorth());
            return true;
        }

        public boolean goEast() {
            if (currentRoom.getEast() == null) {
                return false;
            } else {
                setCurrentRoom((currentRoom.getEast());
                return true;
            }

            public boolean goWest() {
                if (currentRoom.getWest() == null) {
                    return false;
                } else {
                    setCurrentRoom((currentRoom.getWest());
                    return true;
                }

                public boolean goSouth() {
                    if (currentRoom.getSouth() == null) {
                        return false;
                    } else {
                        setCurrentRoom((currentRoom.getSouth());
                        return true;
                    }



                }
            }

            public void moveEast() {
            }

            public void moveSouth() {
            }

            public void moveWest() {}

            public void moveNorth() {}
        }


