import React, { useState, useEffect } from "react";
import DummyElement from "../components/DummyElement";
import { findAllDummies } from "../service/DummyService";

const DummyList = () => {
  const [dummies, setDummies] = useState([]);

  useEffect(() => {
    findAllDummies().then((resp) => setDummies(resp.data));
  }, [findAllDummies, setDummies]);

  return (
    <div>
      {dummies.map((dummy) => (
        <DummyElement dummy={dummy} key={dummy.id}></DummyElement>
      ))}
    </div>
  );
};

export default DummyList;
